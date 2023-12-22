import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int d = sc.nextInt();
			long sum = 0;
			for(int i = 0 ; i <= 600 - d ; i = i+d){
				sum += Math.pow(i,2) * d;
			}
			System.out.println(sum);
		}
	}

}