import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        //init
        int mid = -1, fin = -1, re = -1;

        while(true){
            mid = Integer.parseInt(in.next());
            fin = Integer.parseInt(in.next());
            re = Integer.parseInt(in.next());

            if(mid == -1 && fin == -1 && re == -1)break;
            
            System.out.println(grade(mid, fin, re));
        }
    }

    static String grade(int mid, int fin, int re){
        int sum = mid + fin;
        if(mid == -1 || fin == -1)return "F";
        else if(sum >= 80) return "A";
        else if(sum >= 65)return "B";
        else if(sum >= 50)return "C";
        else if(sum >= 30){
            if(re >= 50)return "C";
            else return "D";
        }
        else return "F";

    }
}
