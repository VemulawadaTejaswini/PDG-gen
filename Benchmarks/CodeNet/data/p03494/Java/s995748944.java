import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			int count = 0;
			Long x = scan.nextLong();
			while((x % 2)==0){
				x /= 2;
				count++;
			}
			
			if(count <= min)min = count;
		}
		System.out.println(min);
	}
}