import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		
		
	
		
		
		
		int[] Bob = new int [101];
		int[] Alice = new int [101];
		int[] onaji = new int [101];
		int nannbyou = 0;
		
		
		for(int i = A;i<=B;i++){
			Bob[i]=1;
		}
		
		for(int i = C;i<=D;i++){
			Alice[i]=1;
		}
		
		for(int i =1;i<101;i++){
			if(Bob[i]==1&&Alice[i]==1){
				onaji[i]=1;
				nannbyou+=1;
			}
		}

		
		
		
		System.out.println(nannbyou);
		
		
		
		
		
	}

}
