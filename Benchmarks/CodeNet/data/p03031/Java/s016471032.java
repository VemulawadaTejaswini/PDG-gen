import java.util.*;

public class Main {
    private static int[] vim;
    private static boolean[] flag;
    private static List<Buld> list;
    private static int sum;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        list = new ArrayList<>();
        vim = new int[n];
        flag = new boolean[n];
        sum = 0;
        for(int i=0;i<m;i++){
            int k = in.nextInt();
            List<Integer> swi = new ArrayList<>();
            for(int j=0;j<k;j++){
                swi.add(in.nextInt());
            }
            list.add(new Buld(swi));
        }
        for(int i=0;i<m;i++){
            list.get(i).p=in.nextInt();
        }
        dfs(0,n,m);
        System.out.println(sum);
    }
    public static void dfs(int x,int n,int m){
        if(x == n){
            for(int i=0;i<m;i++){
                Buld b = list.get(i);
                int att=0;
                for(Integer s:b.swi){
                    att^=vim[s-1];
                }
                if(att != b.p)
                    return;
            }
            sum++;
        } else {
            for (int i = 0; i < 2; i++) {
                vim[x] = i;
                dfs(x + 1, n, m);
            }
        }
    }
    static class Buld{
        public List<Integer> swi;
        public Integer p;
        public Buld(List<Integer> list){
            this.swi = list;
        }

    }
}
