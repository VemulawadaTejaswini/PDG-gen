
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void Main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) A[i]=sc.nextInt();


		int old_hight = 0;
		int sum = 0;

		for(int h : A) {
			if(old_hight!=0){
				if(h >= old_hight) {
					old_hight=h;
				}
				else {
					int s = h - old_hight;
					sum = sum + s;
					old_hight = h;
				}
			}
		}

		System.out.println(sum);

	}
}