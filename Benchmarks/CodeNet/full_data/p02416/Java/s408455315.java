import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;){
			int x = sc.nextInt();
			int num = 0;
			if(x==0)break;
			for(;;){
				num = num + (x%10);
				x = x / 10;
				if(x==0)break;
			}
			System.out.println(num);
		}
	}	
}