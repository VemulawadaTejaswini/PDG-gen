import java.util.Scanner;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int []array=new int [w];
        for(int i=0;i<w;i++)array[i]=i+1;
        int a=0,b=0;
        for(int i=0;i<n;i++){
            String s=sc.next();
            a=s.charAt(0)-'0';
            b=s.charAt(2)-'0';
            int tmp=0;
            tmp=array[a-1];
            array[a-1]=array[b-1];
            array[b-1]=tmp;
        }
        for(int i=0;i<w;i++)System.out.println(array[i]);
    }
}
