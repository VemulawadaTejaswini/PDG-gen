import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        int N = sc.nextInt();
        int[] d = new int[N];
        int hp = 0;

        for (int i = 0; i < N; i++)
            d[i] = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) 
                    hp += d[i] * d[j];
            }
        }
        System.out.println(hp/2);
   	}
}