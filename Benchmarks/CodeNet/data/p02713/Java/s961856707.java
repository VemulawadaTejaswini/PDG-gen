import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        int v=a%b;
        return gcd(b,v);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        long all=0;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                for(int k=1;k<=a;k++){
                    if(i==1||j==1||k==1)
                        all+=1;
                    else
                        all+=Main.gcd(Main.gcd(i,j),k);
                }
            }
        }
        System.out.println(all);


    }
}
