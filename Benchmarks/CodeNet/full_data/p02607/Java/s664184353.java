import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
                
        //a1 - an の読み込み
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // 探索
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if(i % 2 == 1 && a[i] % 2 == 1){
                count++;
            }
        }

        System.out.println(count);
    }
}
