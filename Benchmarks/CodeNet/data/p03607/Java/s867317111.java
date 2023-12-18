import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N];
		int cnt = 0;
		for(int i=0;i<N;i++){
			list[i] = 0;
		}
		for(int i=0;i<N;i++){
			list[i] = sc.nextInt();
		}
		ArrayList<Integer> list2= new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			if(!list2.contains(list[i])){
				list2.add(list[i]);
				cnt++;
			}else{
				cnt--;
			}
		}
		System.out.println(cnt);
	}
}