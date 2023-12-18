import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int c = 0;
        for(int i=0;i<p;i++){
            int x= scan.nextInt();
            int y= scan.nextInt();
            if(x>=m&&y>=n){c++;}
        }
        System.out.println(c);
    }
}