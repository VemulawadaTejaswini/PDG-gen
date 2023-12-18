import java.util.HashMap;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        HashMap<Integer, Integer> mul = new HashMap<Integer, Integer>();         
        for(int i = 1; i < N+1; i++){
            if((N % i) == 0){
                int j = N / i;
                mul.put(i,j);
            }
        }

        int min = N;
        for (HashMap.Entry<Integer, Integer> entry : mul.entrySet()) {
            if(min > entry.getKey() +entry.getValue()){
                min = entry.getKey() +entry.getValue();
            }           
        }
        System.out.println(min-2);

    }
}