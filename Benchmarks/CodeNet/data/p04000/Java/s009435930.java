import java.util.*;

class Main{
    static int H;
    static int W;
    static HashMap<Long,Integer> used;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        int[] ans = new int[10];
        used = new HashMap<>();
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            int row = a[i];
            int col = b[i];
            for(int j=row;j<=row+2;j++){
                for(int k=col;k<=col+2;k++){
                    helper(j,k);
                }
            }
        }
        for(Long w:used.keySet()){
            ans[used.get(w)]++;
        }
        long all = ((long)W-2)*((long)H-2);
        for(int i=1;i<=9;i++) all-=ans[i];
        System.out.println(all);
        for(int i=1;i<=9;i++) System.out.println(ans[i]);

    }
    static void helper(int row, int col){
        // 考察以(row,col)为最右下的那个3*3单元
        if(row<=2||col<=2) return;
        if(row>H||col>W) return;
        long cur = ((long)row)*(W+1)+((long)col);
        if(!used.containsKey(cur)) {
            used.put(cur,1);
        }
        else{
            int now = used.get(cur);
            used.put(cur,now+1);
        }

    }
}
