import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int number_n, i;
      	long sum = 0;
      	number_n = Integer.parseInt(sc.next());
        long[] number = new long[number_n];
      	for(i = 0; i < number_n; i++) {
          number[i] = Long.parseLong(sc.next());
          sum += number[i];
        }
      	Arrays.sort(number);
      	sum -= 2 * number[0];
      	System.out.println(sum);
      	for(i = 0; i < number_n - 2; i++) {
          System.out.print(number[i]);
          System.out.print(" ");
          System.out.println(number[i+1]);
          number[i+1] = number[i] - number[i+1];
      	}
      	System.out.print(number[i+1]);
        System.out.print(" ");
        System.out.println(number[i]);
    }
}
