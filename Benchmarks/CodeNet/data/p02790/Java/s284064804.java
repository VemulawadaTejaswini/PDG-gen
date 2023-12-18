import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = (a>=b?a:b);
        int n = (a==m?b:a);
        for(int i=0;i<m;i++){
            out.print(n);
        }
        out.println();
        scan.close();
    } 
}