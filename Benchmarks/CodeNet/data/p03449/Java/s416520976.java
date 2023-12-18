import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int trout = sc.nextInt();
		int[] Line1 = new int[trout];
		int[] Line2 = new int[trout];
		for(int i = 0; i < trout; i++){
			Line1[i] = sc.nextInt();
		}
		for(int i = 0; i < trout; i++){
			Line2[i] = sc.nextInt();
		}
		int Result = 0;
		for(int i = 0; i < trout; i++){
			int total = 0;
            for(int j = 0; j <= i; j++){
				total += Line1[j];
			}
			for(int j = i; j < trout; j++){
				total += Line2[j];
			}
			if(Result < total){
				Result = total;
			}
		}
		System.out.println(Result);
		sc.close();
	}
}

