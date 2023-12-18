import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] z = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            z[i] = x[i];
        }
        Arrays.sort(x);
//        int[] y = new int[n];
//        for(int i = 0; i < n; i++){
//            y[i] = x[n - 1 - i];
//        }
        int medA = x[n / 2];
        int medB = x[(n - 1) / 2];
        for(int i = 0; i < n; i++){
            if(z[i] < medA){
                System.out.println(medA);
            } else {
                System.out.println(medB);
            }
        }
    }
}
