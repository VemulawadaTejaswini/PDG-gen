import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int sum;
		int score[] = new int[3];

		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();

		while(score[0] != -1 || score[1] != -1 || score[2] != -1){
			sum = score[0] + score[1];

			if(score[0] == -1 || score[1] == -1){
				System.out.println("F");
			}else if(sum >= 80){
				System.out.println("A");
			}else if(sum >= 65){
				System.out.println("B");
			}else if(sum >= 50){
				System.out.println("C");
			}else if(sum >= 30){
				if(score[2] >= 50) System.out.println("C");
				else System.out.println("D");
			}else{
				System.out.println("F");
			}

			score[0] = sc.nextInt();
			score[1] = sc.nextInt();
			score[2] = sc.nextInt();
		}
	}
}
