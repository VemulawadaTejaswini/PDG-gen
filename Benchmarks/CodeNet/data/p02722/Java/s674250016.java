import java.util.Scanner;

public class Main {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	long n = sc.nextLong();
      	long k = 2;
      	int counter = 0;
      	while (n >= k) {
       		while (n > 1) {
             	if (n % k == 0) {
                 	n /= k; 
                } else {
                  	n = n - k;
                }
            }
          	if (n == 1) {
              counter++;
            }
          	k++;
        }
      	System.out.println(counter);
      	sc.close();
    }
}