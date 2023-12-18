import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int[] like = new int[n+1];
		for(int i=1; i<=n; i++){
			like[i] = sc.nextInt();
		}
		for(int i=1; i<=n; i++){
			if(like[like[i]]==i){
				cnt++;
			}
		}
		System.out.println(cnt/2);
	}
}