import java.util.Scanner;

public class Main {
  	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		boolean[] a = new boolean[1000000001];
		boolean ans = true;

		for(int i=0;i<N;i++){
			int ai = sc.nextInt();

			if(a[ai] == true){
				ans = false;
				break;
			}

			a[ai] = true;
		}

		if(ans){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
}