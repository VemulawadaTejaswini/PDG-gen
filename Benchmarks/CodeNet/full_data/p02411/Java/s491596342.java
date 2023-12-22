
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			String grade = "C";
			if(m == -1){
				if(f == -1 && r == -1){
					break;
				}else{
					grade = "F";
				}
			}else{
				if(f == -1){
					grade = "F";
				}else{
					int sum = m + f;
					if(sum >= 80){
						grade = "A";
					}else if(sum >= 65){
						grade = "B";
					}else if(sum < 30){
						grade = "F";
					}else if(sum < 50 && r < 50){
						grade = "D";
					}
				}
			}
			System.out.println(grade);
		}
	}
}

