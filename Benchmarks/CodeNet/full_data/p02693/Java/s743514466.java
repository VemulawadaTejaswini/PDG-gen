import java.util.Scanner;
	public static void main(String[] args) {
	
		  Scanner scanner = new Scanner(System.in);

int K = scanner.nextInt();
int A = scanner.nextInt();
int B = scanner.nextInt();

	for(; A <= B; A++) {

    if(K % A == 0) {
    System.out.println("OK");
    System.exit(0);
  }
	}
	System.out.println("NG");
    
	  }
}
