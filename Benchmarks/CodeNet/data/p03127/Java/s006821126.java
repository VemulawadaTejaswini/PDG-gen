import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			list[i] = a;
		}
		int flag = 0;
		int ans = 0;
		Arrays.sort(list);
		while(flag == 0){
			if(list[n - 2] == 0){
				ans = list[n - 1];
				flag = 1;
			}else if(list[n - 1] % list[n - 2] == 0){
				list[n - 1] = 0;
				Arrays.sort(list);
			}else{
				list[n -1] = list[n - 1] - list[n - 2];
				Arrays.sort(list);
			}
		}
		System.out.println(ans);
	}
}