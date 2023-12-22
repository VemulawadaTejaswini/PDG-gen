import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[]ans = new int[10001];
        for(int x = 1;x < 70;x++){
            for(int y = 1;y< 70;y++){
                for(int z = 1;z < 70;z++){
                    int next = x*x + y*y + z*z + x*y + y*z + z*x;
                    //map.put(next,map.getOrDefault(next,0) + 1);
                    if(next <= 10000)
                    ans[next] = ans[next] + 1;
                }
            }
        }
        for(int i = 1;i <= n;i++){
            System.out.println(ans[i]);
        }
    }
}
