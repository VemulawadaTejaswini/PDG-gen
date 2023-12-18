import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        for (int i = 0; i < 2*N-1; i++) {
        	if(i == 2*N-2) {
        		System.out.print(X-N+1+i);
        	}else {
			System.out.print(X-N+1+i+ "　");
        	}
		}
       
    }
}