import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int cc = 0;
    	if(a == 1) cc++;
    	if(b == 1) cc++;
    	if(c == 1) cc++;

    	System.out.println(cc);
    }
}