import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//入力
		int N = scanner.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		for(int i=0;i<N;i++)
			a[i] = scanner.nextInt();
		for(int i=0;i<N;i++)
			b[i] = scanner.nextInt();
		
		int d1 = 0;
		for(int i=0;i<N;i++){
		        d1 += a[i];
		}
		int d2 = 0;
		for(int i=0;i<N;i++){
		        d2 += b[i];
		}	

		if(d1 >= d2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		scanner.close();
	}
}