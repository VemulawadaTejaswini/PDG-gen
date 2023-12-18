import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	int k = scan.nextInt();

	long ans = k*(long)Math.pow(k-1, n-1);

	/* 出力 */
	System.out.println(ans);
    }
}
