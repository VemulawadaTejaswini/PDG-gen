import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        int[] a = new int[h];
        int[] b = new int[w];
        HashMap<Long, Integer> c = new HashMap<>();
        
        for(int i=0; i<m; i++){
            int y = Integer.parseInt(sc.next())-1;
            int x = Integer.parseInt(sc.next())-1;
            a[y]++;
            b[x]++;
            long key = ((long)y<<32)+x;
            c.put(key, c.getOrDefault(key, 0)+1);
        }
        
        //bをソートするべき？
        long[] d = new long[w];
        for(int i=0; i<w; i++){
            d[i] = ((long)b[i]<<32) + i;
        }
        Arrays.sort(d);
        for(int i=0; i<w/2; i++){
            long tmp = d[i];
            d[i] = d[w-i-1];
            d[w-i-1] = tmp;
        }
        
        int max = 0;
        for(int i=0; i<w; i++){
            if((d[0]>>32) != (d[i]>>32)){
                break;
            }
            max++;
        }
        
        //System.out.println(max);
        
        long ans = 0;
        
        for(int i=0; i<h; i++){
            for(int j=0; j<max; j++){
                long res = (d[j]>>32) + a[i];
                if(res <= ans){
                    continue;
                }
                long key = ((long)i<<32) + (int)d[j];
                if(c.getOrDefault(key, 0) > 0){
                    res--;
                }
                ans = Math.max(ans, res);
            }
        }
        
        System.out.println(ans);
    }
}