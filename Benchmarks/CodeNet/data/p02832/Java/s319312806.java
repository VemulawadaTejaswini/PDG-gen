import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i = 0;i < N;i++){
			a.add(sc.nextInt());
		}
		sc.close();
		
		int flg = 1;
		int cnt = 0;
		if(a.indexOf(1) == -1){
			System.out.println(-1);
			return;
		}else{
			for(int i = 0;i < a.indexOf(1);i++){
				cnt++;
			}
			for(int i = a.indexOf(1);i < N-1;i++){
				if(a.get(i+1)==flg+1){
					flg++;
				}else{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}