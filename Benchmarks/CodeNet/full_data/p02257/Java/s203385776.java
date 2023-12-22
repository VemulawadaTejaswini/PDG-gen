import java.io.*;
import java.util.*;



class Main{
    //読み込みのテンプレ(stringオブジェクトまで)
    
    static int number;
    static int[] linenumbers;
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Integer that shows the number of the lines
        String strnumber = reader.readLine();
        int number = Integer.parseInt(strnumber);
        
        //System.out.println(number);
        
        int[] linenumbers = new int[number];
        
        for(int i=0;i<number;i++){
            linenumbers[i] = Integer.parseInt((String)reader.readLine());
        }
        int prime_number=0;
        
        for(int i=0;i<linenumbers.length;i++){
            if(isPrime(linenumbers[i]))prime_number++;
        }
        
        System.out.println(prime_number);
    }
    
    public static boolean isPrime(int n){
        if(n==2)return true;
        else if(n%2==0)return false;
        else if(n<9)return true;
        else{
            for(int i =3;i*i<=n;i+=2){
                if(n%i==0)return false;
            }
            return true;
        
        }
    
    }
    
    
}