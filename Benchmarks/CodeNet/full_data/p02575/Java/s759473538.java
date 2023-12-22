
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/12 7:58 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int right = 1;
        int[] ans = new int[h+1];
        for(int i = 1;i<=h;i++){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if(right < l){
                ans[i] = ans[i-1] + 1;
            }else{
                if(r + 1 <= w){
                    if(i != 1) {
                        ans[i] = ans[i - 1] + 1 + (r + 1) - right;
                    }else{
                        ans[i] = 1;
                    }
                    right = r+1;
                }else{
                    ans[i] = -1;
                }
            }
            System.out.println(ans[i]);
        }
    }
}
