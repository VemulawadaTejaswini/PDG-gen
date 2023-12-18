import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long X=sc.nextLong();
        long now = 100L;
        for(int i=1; i<10000; i++){
            now += (now/100);
            if(now >= X){
                p(i);
                System.exit(0);
            }
        }
    }
    public static void p(Object o){
        System.out.println(o);
    }
}
