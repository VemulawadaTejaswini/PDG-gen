import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        double monies[] = new double[N];
        String currencies[] = new String[N];

        for (int i = 0; i < N; i++){
            
            monies[i] = sc.nextDouble();
            currencies[i] = sc.next();
        }

        double total = 0;
        int coefficient = 0;

        for (int i = 0; i < N; i++){
            
            if (currencies[i].equals("JPY")) {
                coefficient = 1;
            } else if ( currencies[i].equals("BTC")) {
                coefficient = 380000;
            } else {

            }

            total += (monies[i] * coefficient);
        }



        System.out.println(total);
     }
}