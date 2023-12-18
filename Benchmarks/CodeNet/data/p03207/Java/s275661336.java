import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
        int best=0;
        int sum=0;
        for (int i=0; i<=N; i++) {
            int di = sc.nextInt();
            if(best<di){
                best=di;
            }
            sum=sum+di;
        }
        sum=best-(best)/2;
        System.out.println(sum);
	}
}