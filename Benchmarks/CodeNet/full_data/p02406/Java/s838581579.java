import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int x=i;
            if (x%3==0){
                System.out.print(" "+i);
                continue;
            }
            else if(x%10==3){
                System.out.print(" "+i);
                continue;
            }
            while ((x/=10)!=0){
                if (x%10==3){
                    System.out.print(" "+i);
                    break;
                }
            }
        }
        System.out.print("\n");
    }
}