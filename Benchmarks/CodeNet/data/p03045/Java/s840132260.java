import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] uf = new int[N];
        Arrays.fill(uf,-1);

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int z = sc.nextInt();
            if(x<y) {
                if(uf[x]==-1) {
                    uf[y] = x;
                }else{
                    uf[y] = uf[x];
                }
            }else {
                if(uf[y]==-1) {
                    uf[x] = y;
                }else{
                    uf[x] = uf[y];
                }
            }
        }

        int count =0;
        for(int leader : uf) if(leader==-1) count++;
        System.out.println(count);
    }
}