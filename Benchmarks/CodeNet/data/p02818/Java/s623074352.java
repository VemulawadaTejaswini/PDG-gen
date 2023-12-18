import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long cookieT =sc.nextLong();
        long cookieA =sc.nextLong();
        long count = sc.nextLong();
        long takahashi = cookieT;
        long aoki = cookieA;

        if(cookieT<=count){
            takahashi = 0;
        }else{
            takahashi = takahashi -count;
        }
        if((count-cookieT)>cookieA){
            aoki = 0;
        }else{
            aoki = aoki-(count-cookieT);
        }

        System.out.println(takahashi+" "+aoki);
        sc.close();
    }
}
