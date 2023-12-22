import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] h = new long[n];
        List<Integer>[] ab = new List[n];

        for(int i=0; i<n; i++){
            h[i] = sc.nextLong();
            ab[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            ab[a-1].add(b-1);
            ab[b-1].add(a-1);
        }

        int total = 0;
        for(int i=0; i<n; i++){
            boolean flag = true;
            int size = ab[i].size();
            for(int j=0; j<size; j++){
                int num = ab[i].get(j);
                if(h[i] <= h[num]){
                    flag = false;
                    break;
                }
            }
            if(flag)total++;
        }
        System.out.println(total);
    }
}