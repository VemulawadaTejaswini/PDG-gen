import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A<=B){
			for(int i=A; i<=B; i++){
				if(i==C){
					System.out.println("Yes");
            	}
			}
        }else{
			for(int i=B; i<=A; i++){
				if(i==C){
					System.out.println("Yes");
            	}
			}
        }
		System.out.println("No");
	}
}
