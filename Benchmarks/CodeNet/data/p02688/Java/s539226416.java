
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] flag = new boolean[n];
        for(int i=0;i<k;i++){
            for(int j=0, d_i=sc.nextInt();j<d_i;j++){
                flag[sc.nextInt()-1] = true;
            }
        }
        int sum = 0;
        for(int i=0;i<k;i++){
            if(!flag[i]) {
                sum++;
            }
        }
        System.out.println(sum);

    }
}
