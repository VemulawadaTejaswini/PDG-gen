import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        double e=a*1.0/d;
        int e1=a/d;
        if(e>e1){
            e1++;
        }
        double f=c*1.0/b;
        int f1=c/b;
        if(f>f1){
            f1++;
        }
       if(e1>=f1){
           System.out.println("Yes");
       }
        if(e1<f1){
            System.out.println("No");
        }
    }
}