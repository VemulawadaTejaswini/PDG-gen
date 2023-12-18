import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
        int K = scanner.nextInt();
      
		for(int i=0; i<=K-1; i++){
          
        	if(A >= 1){
           		A=A-1;
         	}else if(B >= 1){
           		B=B-1;
         	}
        }
       
        System.out.print(A);
        System.out.print(B);
    }
}
