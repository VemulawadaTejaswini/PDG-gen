import java.util.Scanner;

public class TrainingCamp {
	 public static void main(String[] args) {
		 Scanner a = new Scanner(System.in);
		 int N = a.nextInt();
		 double power = 1;
		 for(int i = 1; i <= N; i++){
			 power = (power * i) % 100000000+7; 
		 }
		 System.out.println(power);
	}
 
}