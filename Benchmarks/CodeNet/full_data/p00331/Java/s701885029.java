import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),r=sc.nextInt();
        int a=r-h;
        if(a==2*r) {
            System.out.println(0);
        }else if(a>2*r) {
            System.out.println(-1);
        }else {
            System.out.println(1);
        }
     
    }
}
