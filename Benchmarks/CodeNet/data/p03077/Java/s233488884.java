import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();


        long min = Math.min(a,b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        min = Math.min(min, e);

//        long minute = n/min+1;
        long minute=0;
        
        if (n%min==0){
            minute = n/min;
        }else{
            minute = n/min+1;
        }

        System.out.println(minute+4);

    }

}