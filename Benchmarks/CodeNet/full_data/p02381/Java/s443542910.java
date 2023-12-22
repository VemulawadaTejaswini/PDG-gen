import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[] s;
        double mean,stdiv,var;
        while (true){
            n = input.nextInt();
            if (n == 0){
                break;
            }
            s = new int[n];
            var = 0;
            mean = 0;
            for (int i = 0; i < n; i++){
                s[i] = input.nextInt();
                mean += s[i];
            }
            mean /= n;
            for (int i = 0; i < n; i++){
                var += Math.pow(s[i]-mean,2);
            }
            var /= n;
            stdiv = Math.sqrt(var);
            System.out.println(stdiv);
        }
    }
}
