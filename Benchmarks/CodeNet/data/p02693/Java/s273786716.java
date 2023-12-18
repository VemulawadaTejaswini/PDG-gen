import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean flag = true;
		for (int i = A; i <= B; i++) {
			if (i%K==0) {
				System.out.println("OK");
				flag = false;
				break;
				
			}	
			
		}	
		if(!flag){
			System.out.println("NG");
		}
      	sc.close();
    }
		
		
}
