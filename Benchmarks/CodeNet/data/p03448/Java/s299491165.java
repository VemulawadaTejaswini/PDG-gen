import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int count = 0;

        for (int a=0; a<=A; a++) {
            for(int b=0; b<=B; b++){
                for(int c=0; c<=C; c++){
                    int total = 500 * a + 100 * b + 50 * c; 
                    if (total == X) { count +=1 ;}
                }
            }
        }
        System.out.println(count);
	}
}