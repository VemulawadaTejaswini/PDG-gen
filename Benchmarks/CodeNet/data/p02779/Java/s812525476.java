import java.util.Scanner;

public class Main {
  
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		//long a1 = sc.nextLong();

		boolean ans = true;

		/*
		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
		}
		*/

		//a[0] = sc.nextInt();

		for(int i=0;(i<N)&&(ans);i++){
			a[i] = sc.nextInt();
			
			for(int j=0;j<i;j++){

				if(a[i] == a[j]){
					ans = false;
					break;
				}
			}
		}

		if(ans){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
	
}