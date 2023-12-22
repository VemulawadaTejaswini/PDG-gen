import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int c=0;
        while(n-->0) {
            int m=sc.nextInt();
            int w=sc.nextInt();
            if(max<w) {
                max=w;
                c=m;
            }         
        }
        System.out.println(c+" "+max);
    }
}
