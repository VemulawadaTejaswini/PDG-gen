import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        if(b>0 && d>0){
        	System.out.println(b*d);
        }else if(b<0 && d>0){
        	System.out.println(b*c);
        }else if(b>0 && d<0){
        	System.out.println(a*d);
        }else if(b<=0 && d<=0){
        	System.out.println(a*c);
        }
    }
}