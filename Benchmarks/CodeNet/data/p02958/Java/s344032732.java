import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int p[] = new int[N];

		for (int i=0; i<N; i++){
			p[i] = sc.nextInt();
		}

		for (int i=0; i<N; i++){
			for (int j=i+1; j<N; j++){
				if (p[i] > p[j]){
					int temp = p[i];
					p[j] = p[i];
					p[i] = temp;
					break;
				}
			}
		}

		boolean result = true;
		for (int i=0; i<N-1; i++){
			if (p[i] > p[i+1]){
				result = false;
				break;
			}
		}

		if (result){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}


}