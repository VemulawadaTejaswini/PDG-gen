import java.io.*;
import java.util.*;

class Solution{
    int N;
    int K;
    String[] strings;

    String answer = "";

    void recurse(int index,String current){
        //System.out.println(current);

        if(current.length() == K){
            if(current.compareTo(answer) < 0 || answer.length() == 0) {
                answer = current;
            }
            
        }

        if(index >= N){
            return ; 
        }

        recurse(index+1,current+strings[index]);
        recurse(index+1,current);

    }


    void solve() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");
        
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        strings = new String[N];

        for(int i=0;i<N;i++){
            strings[i] = bufferedReader.readLine();
        }

        recurse(0,"");

        System.out.println(answer);

    }


}

public class Main {

    public static void main(String[] args) throws IOException{

        new Solution().solve();

    }

}