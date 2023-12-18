import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] N = sc.next().toCharArray();


    	int sum = 0;
    	for (int i = 0; i < N.length; i++) {
			sum += Character.getNumericValue(N[i]);
		}

    	if (sum % 10 == 0){
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }
}