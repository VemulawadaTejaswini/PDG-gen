import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt();
		int M = sc.nextInt();

		if(D==0){
			if(M==100) System.out.println(101);
			else System.out.println(M);
		}

		if(D==1){
			if(M==100) System.out.println(10100);
			else System.out.println(M*100);
		}

		if(D==2){
			if(M==100) System.out.println(1010000);
			else System.out.println(M*10000);
		}
	}
}