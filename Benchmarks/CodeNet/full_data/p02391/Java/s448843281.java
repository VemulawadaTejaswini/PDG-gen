import java.util.*;
import java.io.*;

class text {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
        	 System.out.println(a+"<"+b);
        }else if(a>b){
        	System.out.println(a+">"+b);
        }else{
        	System.out.println(a+"="+b);
        }
        
    }
