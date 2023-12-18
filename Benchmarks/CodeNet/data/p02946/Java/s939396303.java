import java.util.*;

public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int k = sc.nextInt();
      	int x = sc.nextInt();
      	int pos = k;
      	k *= -1;
      	k += 1;
      	while (k < pos) {
      		System.out.print(x + k + " ");
      		k++;
      	}
    }
}