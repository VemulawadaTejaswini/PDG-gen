import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextDouble();
			double sum = a;

			for(int i = 2;i<=10;i++){
				if(i%2 == 0){
					a = a * 2;
				}else{
					a = a / 3;
				}
				sum += a;
			}
			System.out.println(sum);
		}
	}
}