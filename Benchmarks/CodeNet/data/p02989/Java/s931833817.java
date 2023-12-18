import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = scan.nextInt();
        }
        Arrays.sort(d);
        if(d[n / 2] - d[n / 2 - 1] <= 1){
            System.out.println(0);
        }else{
            System.out.println(d[n / 2] - d[n / 2 - 1]);
        }
    }
}