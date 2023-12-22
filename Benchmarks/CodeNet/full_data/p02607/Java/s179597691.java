import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int count = 0;
	int num;
	for (int i=0; i<N; i++) {
	    num = sc.nextInt();
	    if (i%2 == 1) {
		if (num%2 == 1) {
		    count++;
		}
	    }
	}
	System.out.print(count);
    }
}
