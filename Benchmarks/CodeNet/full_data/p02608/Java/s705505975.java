import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];

        for(int x = 1; x < 100; x++){
            for(int y = 1; y < 100; y++){
                for(int z = 1; z < 100; z++){
                    int i = x * x + y * y + z * z + x * y + y * z + z * x;
                    if(i <= n){
                        a[i]++;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(a[i]).append("\n");
        }
        System.out.println(sb);
    }
}
