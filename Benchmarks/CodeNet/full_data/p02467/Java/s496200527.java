import java.util.Scanner;

public class Test{
     public static void main(String[] args){
     	int MAX = 10*10*10*10*10*10*10*10*10;
     	Scanner scan = new Scanner(System.in);
     	int n = Integer.parseInt(scan.next());
     	
     	System.out.print(n + ":");
     	for (int i = 2; i <= MAX; i++) {
     		if (n == 1) {
     			break;
     		}
     		if (n%i == 0) {
     			System.out.print(" " + i);
     			n = n/i;
     			i = 1;
     		}
     	}
     }
}