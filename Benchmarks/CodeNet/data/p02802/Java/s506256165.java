import java.util.*;

class Main{
    //150a
    static final long DIV = 100000007L;
    static final int MAX = 2000000000;
    //static long[] fac = new long[MAX];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] collect = new boolean[n];
        int ans = 0;
        int pen = 0;
        for(int i = 0;i < m;i++){
            int pi = sc.nextInt();
            String s = sc.next();
            if(!collect[pi-1]){
                if(s.equals("WA")){
                    pen++;
                }else if(s.equals("AC")){
                    collect[pi-1] = true;
                    ans++;
                }
            }     
        }
        System.out.println(ans + " " + pen);
    }
}