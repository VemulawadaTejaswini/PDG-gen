import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = x; i <= 100000; i++){
			boolean flag = true;
			for(int j = 2; j < x; j++){
				if(i%j==0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(i);
				return;
			}
		}



	}

}