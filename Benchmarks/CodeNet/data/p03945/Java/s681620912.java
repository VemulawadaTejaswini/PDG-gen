import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        String s = in.s();
        int N = s.length();
        int ans = 0;
        char t = s.charAt(0);
        for(int i = 1; i < N; i++){
            if (s.charAt(i) != t) {
                ans++;
                t = s.charAt(i);
            }
        }
        out.println(ans);
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }
    }
}
