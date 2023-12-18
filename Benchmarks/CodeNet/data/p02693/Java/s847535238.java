import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int check = 0;
        
        for(int i=A; i<=B; i++) {
        	if(i%K == 0) {
        		check = 1;
        	}
        }
        
        if(check == 1){
        	System.out.println("OK");
        }else{
        	System.out.println("NG");
        }
        
	}
}
