import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        long ans = 0;
        char[] input = s.toCharArray();
        
        for (int i=0; i<(1<<n-1); i++){
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            for (int j=0; j<n; j++){
                sb.append(input[j]);
                if ((i & (1<<j)) == 1){
                    sum += Long.parseLong(sb.toString());
                    sb.setLength(0);
                }
            }

            if(sb.length()!=0){
                sum+=Long.parseLong(sb.toString());
            }

            ans += sum;
        }
        
        System.out.println(ans);
    }

}
