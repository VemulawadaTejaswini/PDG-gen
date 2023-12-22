import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        // 0
        if(Arrays.asList(arr).contains("0")){
            System.out.println(0);
            return;
        }

        long ans = 1;
        for(String str : arr){
            ans = ans * Long.parseLong(str);

            // 上限
            if(ans > 1000000000000000000L){
                ans = -1;
                break;
            }
        }

        System.out.println(ans);
    }
}