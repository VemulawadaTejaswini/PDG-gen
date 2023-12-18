import java.io.*;
import java.util.*;


class Solution{
    

    boolean allOkay(int[] alphabets , int n){
        for(int i =0;i<alphabets.length;i++){
            if(alphabets[i]>n/2){
                return false;
            }
        }

        return true;
    }   

    void solve() throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();

        int start=0;
        int end = a.length()-1;

        int[] alphabets = new int[26];


        for(int i = 0;i<a.length();i++){
            alphabets[a.charAt(i)-'a']++;
        }

        

        while(true){
            if((end-start+1)>=2){

                if(!allOkay(alphabets,end-start+1)){
                    System.out.println((start+1) + " " + (end+1));
                    return;
                }

                alphabets[a.charAt(end)-'a']--;
                alphabets[a.charAt(start)-'a']--;
                start++;
                end--;
            }else{  
                break;
            }
        }

        System.out.println("-1 -1");

    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        new Solution().solve();
    }   
}