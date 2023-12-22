import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,n;
        int[] p = {0,6,4,3,2};
        for(int i=0;i<4;i++){
            t=sc.nextInt();
            n=sc.nextInt();
            System.out.println(p[t]*n*1000);
        }
    }
}