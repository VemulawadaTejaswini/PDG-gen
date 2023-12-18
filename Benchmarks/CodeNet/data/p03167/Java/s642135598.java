import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        List<String> list = new ArrayList<>();
        long[] dp = new long[w];
        for(int i = 0; i < h; i++){
            list.add(scanner.next());
        }
        int k = h;
        for(int i = 0; i < h; i++){
            if(list.get(i).charAt(0) == '#'){
                k = i;
                break;
            }
        }
        for(int i = 0; i < w; i++){
            if(list.get(0).charAt(i) == '#')
                break;
            dp[i] = 1;
        }
        for(int i = 1; i < h; i++){
            for(int j = 0; j < w; j++){
                if(list.get(i).charAt(j) == '#'){
                    dp[j] = 0;
                }else{
                    if(j == 0){
                        if(i < k){
                            dp[j] = 1;
                        }else{
                            dp[j] = 0;
                        }
                    }else{
                        dp[j] += dp[j-1];
                    }
                    dp[j] %= 1000000007;
                }
            }
        }
        System.out.println(dp[w-1]);
    }
}
