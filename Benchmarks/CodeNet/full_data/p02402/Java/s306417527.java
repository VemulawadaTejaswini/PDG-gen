import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val[] = new int[n];
		for(int i=0; i<n; i++){
			val[i] = sc.nextInt();
			while(true){
				if(val[i] <= -1000000 || val[i] >= 1000000)
					val[i] = sc.nextInt();
				else
					break;
			}
		}
		int max = -1000000;
		int min = 1000000;
		int sum = 0;
		for(int i=0; i<n; i++){
			if(val[i] > max)
				max = val[i];
			if(val[i] < min)
				min = val[i];
			sum += val[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}