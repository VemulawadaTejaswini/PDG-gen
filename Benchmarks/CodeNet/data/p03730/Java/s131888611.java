import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A==1){
			System.out.println("YES");
		} else {
			boolean flag = false;
			for(int i=1; i<102; i++){
				if((B*i+C)%A == 0){
					System.out.println("YES");
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println("NO");
			}
		}
		
		
	}

}