import java.util.*;

public class Main{
        
        static int n;
        static int m;
        static int q;

        static int[] a;
        static int[] b;
        static int[] c;
        static int[] d;
    
        static long max;

        static void dfs(int i, List<Integer> list)  {
            
            if(!list.isEmpty() && list.get(list.size() - 1) > m){
                return;
            }

            if(i == n){
                long temp = 0;
                //System.out.println(list.toString());
                for(int j=0; j<q; j++){
                    if(list.get(b[j] - 1) - list.get(a[j] - 1) == c[j]){
                        temp += d[j];
                    }
                }
                if(temp > max){
                    max = temp;
                }
                return;
            }

            int j = 1;
            if(!list.isEmpty()) {
                j = list.get(list.size() - 1);
            }
            for(; j <= m ; j++) {
                List<Integer> newList = new ArrayList<>();
                newList.addAll(list);
                newList.add(j);
                dfs(i + 1, newList);
            }
        }
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        a = new int[q];
        b = new int[q];
        c = new int[q];
        d = new int[q];

        for(int i=0; i<q; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        dfs(0, new ArrayList<Integer>());
        System.out.println(max);
    }
}