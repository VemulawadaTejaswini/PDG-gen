import java.io.*;
import java.util.*;



class Solution{

    boolean found = false;

    int[] numbers = new int[10];

    int a = 0;
    
    void recurse(int index , int number){

        if(index < 0){
            found = true;
            a = number; 
            return;
        }

        String numberString = String.valueOf(number);

        int currentStringLength = numberString.length();
 
        int current = Integer.parseInt(String.valueOf(numberString.charAt(index)));

        for(int i = 0 ; i<9; i++){

            if(numbers[(current+i)%10] == 0){
                
                int newNumber = (int)(number+i*Math.pow(10,currentStringLength-index-1));
                
                if(!found){

                    if(String.valueOf(newNumber).length() > currentStringLength){
                        recurse(index, newNumber);
                    }else{
                        recurse(index-1 , newNumber);                   
                    }
                }
                
                
            }
            
        }
        

    }

    public void solve() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine1 = bufferedReader.readLine().split(" ");
        String[] inputLine2 = bufferedReader.readLine().split(" ");

        

        int N = Integer.parseInt(inputLine1[0]);
        int K = Integer.parseInt(inputLine1[1]);


        for(int i=0;i<inputLine2.length;i++){
            numbers[Integer.parseInt(inputLine2[i])]++;
        }

        recurse(String.valueOf(N).length()-1,N);

        System.out.println(a);
        
    }

}


class Main{


    public static void main(String[] args) throws IOException{
        new Solution().solve();
    }

}