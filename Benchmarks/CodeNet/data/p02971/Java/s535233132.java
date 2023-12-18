import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
        	A[i] = sc.nextInt();
        }
        sc.close();
        int tmp = 0;
        int max = 0;
        for(int i = 0; i < N; i++) {
        	for(int j =0; j < N; j++) {
        		if(i==j) {
        			continue;
        		}
        		tmp = A[j];
        		if(max<tmp) {
        			max=tmp;
        		}
        	}
        	System.out.println(max);
        	max = 0;
        }
	}
}
