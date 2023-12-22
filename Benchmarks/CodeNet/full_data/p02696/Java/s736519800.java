import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        long B=sc.nextLong();
        long N=sc.nextLong();
        if( N >= B -1){
            p( (A * (B-1) )/ B );
        }
        else{
            p( (A * (N) )/ B );
        }
    }
    public static void p(Object o){
        System.out.println(o);
    }
}
