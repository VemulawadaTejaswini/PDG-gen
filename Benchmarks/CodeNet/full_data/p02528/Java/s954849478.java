import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] m = new int[n];
		
		for (int i = 0; i < n; i++){
			m[i] = input.nextInt();
		}
		
		for (int i = 0; i < n - 1; i++){
			int mini = i;
			for (int j = i + 1; j < n; j++){
				if (m[mini] > m[j]) mini = j;
			}
			
			int dam = m[i];
			m[i] = m[mini];
			m[mini] = dam;
		}
		
		for (int i : m){
			System.out.print(i + " ");
		}
		
		System.out.println("\b");
	}
}