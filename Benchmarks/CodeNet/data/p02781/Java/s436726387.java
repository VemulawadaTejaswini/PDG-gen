import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sum = 0;
        for(long i = 0 ; i <= n ; i++){
            int len = (String.valueOf(i).replaceAll("0", "")).length();
            if(len == k){
                sum += 1;
            }
        }

        System.out.println(sum);
    }

}