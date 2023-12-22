import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
       while(true){
        String  x=sc.next();
        if(x.equals("0"))break;
        boolean can=true;
        int  sum=0;
        for(int i=0;i<x.length();i++){
               sum+=Integer.parseInt(x[i]);
           }
        System.out.printtln(sum);
      }
    }
}
