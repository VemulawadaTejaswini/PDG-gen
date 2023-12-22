import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String w = br.readLine();	//１行目の文字を読み取る
        String t;
        int count=0;
        int i=0;
        while((t=br.readLine())!=null){
            if(t.indexOf(w) != -1){
        	   count++;
               i = t.indexOf(w);
               if(t.indexOf(w,i + 1) != -1){
                   count++;
               }
            }
        }
        System.out.println(count);
     }
}