
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N][2];
        for (int i = 0; i < N; i++) {
            map[i][0] = i;
            map[i][1] = sc.nextInt();
        }
        Arrays.sort(map, (a,b)->a[1]-b[1]);
        //dump(map);
        Set<Integer> check = new HashSet<>();
        int result = 0;
        int num = -1;
        for(int p=N-1;p>=0;p--){
            final int index = map[p][0];
            //System.out.print(index + " ");
            if(num == map[p][1]){
                result++;
                num = map[p][1];
                check.add(index);
                continue;
            }
            for(Integer e : check){
                if(index<e){
                    result--;
                    break;
                }
            }
            result++;
            //System.out.println();
            num = map[p][1];
            check.add(index);
        }
        System.out.println(result);
    }

    public static void dump(int[][] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}