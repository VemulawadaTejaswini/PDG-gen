import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i++){
            if((int)((double)i*1.08)==n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}