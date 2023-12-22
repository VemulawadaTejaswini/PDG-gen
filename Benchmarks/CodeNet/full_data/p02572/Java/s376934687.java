import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
      	int length = sc.nextInt();
      	long[] num = new long[length];
      	long result = 0;
      	long stay = 1;
		for(int i = 0; i <= length - 1; i++) {
        	num[i] = sc.nextLong();
        }
      
      	for(int count = 1; count <= 9; count++) {
        	stay *= 10;
        }
      
      	for(int j = 0; j <= length - 2; j++) {
        	for(int k = j + 1; k <= length - 1; k++) {
            	result += (num[j] * num[k]);
            }
        }
		System.out.println(result % (stay + 7));
    }
}