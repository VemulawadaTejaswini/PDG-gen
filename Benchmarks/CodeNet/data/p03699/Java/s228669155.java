import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
        }

        Arrays.sort(ans);

        for (int i = 0; i < n; i++){
            if (total % 10 == 0) {
                total=sum(ans,i);
            } else {
                System.out.println(total);
            }
        }
        if(total%10==0){
            System.out.println("0");
        }
    }

    private static int sum(int[] ans, int j){
        int total=0;
        for(int i=j;i<ans.length;i++){
            total+=ans[i];
        }
        return total;
    }


}
