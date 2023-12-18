import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String ans = "No";
		boolean[] list = new boolean[101];
		Arrays.fill(list,false);
		for(int i = 1;i < 10;i++){
			for(int j = 1;j < 10;j++){
				list[i * j] = true;
			}
		}
		if(list[N]){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}