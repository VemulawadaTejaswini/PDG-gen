import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] RGBN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Function<Integer, int[]> getArr = (v) -> {
            int[] a = new int[(int)Math.ceil(RGBN[3] / v) + 1];
            for(int i=0; i<a.length; i++){
                a[i] = v * i;
            }
            return a;
        };
        int[] r = getArr.apply(RGBN[0]);
        int[] g = getArr.apply(RGBN[1]);
        int[] b = getArr.apply(RGBN[2]);

        int count = 0;
        for(int i1=0; i1<r.length; i1++){
            int t = RGBN[3] - r[i1];
            for(int i2=0; i2<g.length; i2++){
                int tt = t - g[i2];
                for(int i3=0; i3<b.length; i3++){
                    int ttt = tt - b[i3];
                    if(ttt == 0) count++;
                }
            }
        }
        System.out.println(count);
    }
}
