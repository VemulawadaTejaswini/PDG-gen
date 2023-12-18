import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] at = "atcoder".toCharArray();
        int n = sc.nextInt();
        Station[] st = new Station[n-1];
        int[] ans = new int[n];
        for(int i = 0; i < n-1; i++){
            st[i] = new Station(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        for(int i = 0; i < n-1; i++){
            ans[i] = st[i].c+st[i].s;
            for(int j = i+1; j < n-1; j++){
                if(ans[i] <= st[j].s){
                    ans[i] = st[j].c + st[j].s;
                }else{
                    int tmp = ans[i] - st[j].s;
                    int pow = (int)Math.ceil((double)tmp/(double)st[j].f);
                    ans[i] = st[j].c + st[j].s + pow*st[j].f;
                }
            }
        }
        for(int a : ans){
            System.out.println(a);
        }
    }
}

class Station {
    int c,s,f;
    public Station(int c, int s, int f){
        this.c = c;
        this.s = s;
        this.f = f;
    }
}