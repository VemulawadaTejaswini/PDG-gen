import java.io.*;
import java.util.*;
 
class Main {
    public static void main(String args[]){
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    try {
        String s = r.readLine();
        int num = Integer.valueOf(s);
        while(num != 0){
        int result = 0;
        for(int i = 1;i< num; i++){
            int tmp = i;
            int next = i+1;
            while(tmp < num){
            tmp = tmp + next;
            next++;
            }
            if(tmp == num) result++;
        }
        System.out.println(result);
        s = r.readLine();
                num = Integer.valueOf(s);
        }
    }catch(Exception e){}
 
    }
}