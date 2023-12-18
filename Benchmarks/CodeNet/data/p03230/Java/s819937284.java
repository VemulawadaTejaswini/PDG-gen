import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = -1;
        for (int i = 1; i < Math.sqrt(n*2); i++) {
            if(n*2 % i == 0 && n*2 / i == i+1){
                a = i;
                break;
            }
        }
        if(a == -1)System.out.println("No");
        else{
            int k = a+1;
            int[][] s = new int[k][a];
            int num = 1;
            for (int i = 0; i < a; i++) {
                for (int j = i; j < a; j++) {
                    s[i][j] = num;
                    s[j+1][i] = num;
                    num++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Yes" + "\n");
            sb.append(k + "\n");
            for (int i = 0; i < k; i++) {
                sb.append(a);
                for (int j = 0; j < a; j++) {
                    sb.append(" " + s[i][j]);
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
        sc.close();

    }

}
