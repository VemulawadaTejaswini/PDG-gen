import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		int ans = 0;
		for(int i = 0; i < n; i++){
			list.add(scan.nextInt());
		}
		for(int i : list){
			while(i >= i -1){
				ans = i;
			}
		}
		System.out.println(ans);
	}
}