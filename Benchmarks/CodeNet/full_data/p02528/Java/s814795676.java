import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n[]=new int[num];
        for (int i=0;i<num;i++){
            n[i]=sc.nextInt();
        }
        for (int i=0;i<num-1;i++){
            for (int j=0;j<num-1-i;j++){
                if (n[j]>=n[j+1]){
                    int boo=n[j];
                    n[j]=n[j+1];
                    n[j+1]=boo;
                }
            }
        }
        for (int i=0;i<num;i++){
            if (i!=num-1)
                System.out.print(n[i]+" ");
            else
                System.out.println(n[i]);
        }
    }
}