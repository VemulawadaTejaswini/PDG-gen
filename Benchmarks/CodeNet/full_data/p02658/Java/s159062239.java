import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int length = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        if(Arrays.asList(arr).contains("0")){
            System.out.println(0);
            return;
        }

        long ans = 1;
        boolean isbreak = false;
        for(String str : arr){
            ans *= Long.parseLong(str);
            if(ans > 1000000000000000000L){
                System.out.println(-1);
                isbreak = true;
                break;
            }
        }
        if(!isbreak){
            System.out.println(ans);
        }
    }
}