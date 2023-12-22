import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        for(int i=0; i<2000; i++){
            int tmp = K * (i+1);
            if( tmp >= A && tmp <= B){
                p("OK");
                System.exit(0);
            }
        }
        p("NG");

    }
    public static void p(Object o){
        System.out.println(o);
    }
}
