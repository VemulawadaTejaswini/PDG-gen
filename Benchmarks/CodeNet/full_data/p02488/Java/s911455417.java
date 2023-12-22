import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n+1];
        for (int i=0;i<=n;i++){
            s[i]=sc.nextLine();
        }
        for (int i=1;i<n;i++){
            for (int j=i;j<n;j++){
                if (s[j].compareTo(s[j+1])<0){
                    String boo=s[j];
                    s[j]=s[j+1];
                    s[j+1]=boo;
                }
            }
        }
        System.out.println(s[n]);
    }
}