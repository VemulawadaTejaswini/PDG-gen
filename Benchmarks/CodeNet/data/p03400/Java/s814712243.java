import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int[] data = new int[n];
		int sum = 0;
		for(int i=0; i<n; i++){
			data[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++){
			for(int j=1; j<=d; j+=data[i]){
				sum++;
			}
		}

		System.out.println(x+sum);
	}
}