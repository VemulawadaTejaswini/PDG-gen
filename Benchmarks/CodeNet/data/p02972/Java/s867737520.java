import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];

        for(int i = 1;i <= n;i++){
            a[i]  = sc.nextInt();
        }

        int[] ans = new int[n+1];
        int count = 0;
        List<Integer> index = new ArrayList<>();
        for(int i = n;i > 0;i--){
            if(i * 2 > n){
                ans[i] = a[i];
                if(ans[i] == 1){
                    count++;
                    index.add(i);
                }
            } else {
                int sum = 0;
                for(int j = 2;i*j <= n;j++){
                    sum += ans[i*j];
                }
                if(sum % 2 == a[i]){
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                    count++;
                    index.add(i);
                }
            }
        }
        System.out.println(count);
        if(count != 0) {
            StringBuilder sb = new StringBuilder();
            for (Integer i : index) {
                sb.append(i);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());

        }
    }
}

