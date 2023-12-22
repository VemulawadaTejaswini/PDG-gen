import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n<100){
			for(int i = 0; i < n; i++){
				float x1 = sc.nextFloat();
				float y1 = sc.nextFloat();
				float x2 = sc.nextFloat();
				float y2 = sc.nextFloat();
				float x3 = sc.nextFloat();
				float y3 = sc.nextFloat();
				float x4 = sc.nextFloat();
				float y4 = sc.nextFloat();

				if(x2-x1 == x4 - x3){
					if(y2 - y1 == y4 - y3){
						System.out.println("Yes");
					}else{
						System.out.println("No");
					}
				}else{
					System.out.println("No");
				}
			}
		}
	}
}