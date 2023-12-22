import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       for(int i=0;i<5;i++) {
           int h=sc.nextInt();
           int j=sc.nextInt();
           int m=sc.nextInt();
           int x=sc.nextInt();
           int y=sc.nextInt();
           System.out.println(h-Math.max((j-1)/x+1, (m-1)/y+1));
        }
    }
}
