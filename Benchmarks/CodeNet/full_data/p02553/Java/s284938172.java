import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	
        // 入力
        long a = sc.nextInt();
      	long b = sc.nextInt();
      	long c = sc.nextInt();
      	long d = sc.nextInt();
      	long max=0;

		if((b<0&&c>0)||(a>0&&d<0)){
          max=Math.max(b*c,a*d);
        }else{
          max=Math.max(a*c,b*d);
        }
      System.out.println(max);

    }
}