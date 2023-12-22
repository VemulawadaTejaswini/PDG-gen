import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int S = sc.nextInt();
       int h = sc.nextInt();
       int m = sc.nextInt();
       int s = sc.nextInt();
       
       
        if( S <= 86400 ){
            s = S % 60;
            h = ((S - s) / 60) / 60;
            m = ((S - s) / 60) % 60;
        }
        else{
            System.out.println();
        } 
        System.out.printf("%d:%d:%d\n", h, m, s);
    }
}

