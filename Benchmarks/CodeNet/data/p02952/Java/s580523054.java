import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
      	int inputNumber = s.nextInt();
      	int digits = String.valueOf(inputNumber).length();
      	int ans = 0;
      	int size = inputNumber;

		int cnt = 0;
      	for (int i = 0; i < size; i++) {
        	if (String.valueOf(inputNumber).length() % 2 == 1) {
            	ans++;
            }
          inputNumber--;
        }
      
		System.out.println(ans);
    }
}