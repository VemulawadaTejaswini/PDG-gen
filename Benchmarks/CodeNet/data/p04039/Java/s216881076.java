import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> D = new ArrayList<>();
		for(int i = 0;i < K;i++) {
			D.add(sc.nextInt());
		}
		sc.close();
		int res = 0;
		for(int i = N;i < 10*N;i++) {
			if(i < 10) {
				if(!D.contains(i)) {
					res = i;
					break;
				}
			}else if(i < 100) {
				if(!D.contains(i/10) && !D.contains(i%10)){
					res = i;
					break;
				}
			}else if(i < 1000) {
				if(!D.contains(i/100)
						&& !D.contains(i/10%10)
						&& !D.contains(i%100)){
					res = i;
					break;
				}
			}else {
				if(!D.contains(i/1000)
						&& !D.contains(i/10%100)
						&& !D.contains(i/100%10)
						&& !D.contains(i%1000)){
					res = i;
					break;
				}
			}
		}
		System.out.println(res);
	}
}