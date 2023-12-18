import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        String result = "No";

        for(int i = 0; i < s.length(); i++){
            if(t.equals(s)){
                result = "Yes";
            }
            s = turn(s);
        }

        System.out.println(result);
    }

    static String turn(String s){
        String end = s.substring(s.length() - 1, s.length());
        String tmp = end + s;
        return  tmp.substring(0,tmp.length() - 1);
    }
}
