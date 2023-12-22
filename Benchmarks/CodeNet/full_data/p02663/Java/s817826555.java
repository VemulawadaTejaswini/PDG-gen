import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1= sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int K = sc.nextInt();
        int res;

        res = Math.max((h2-h1)*60+(m2-m1)-K,0);
        
        
        System.out.println(res);
        }
    }