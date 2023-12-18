import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long circle = sc.nextLong();
        ArrayList<Sushi> sushi = new ArrayList<Sushi>();
        for(int i = 0 ; i < n; i++){
            long d = sc.nextLong();
            long c = sc.nextLong();
            Sushi s = new Sushi(d,c);
            sushi.add(s);
        }
        long now = 0;
        long ans = 0;
        long ansccw = 0;
        int ccw_i = 0;
        ArrayList<Ccw> ccw_li = new ArrayList<Ccw>();
        for(int i = 0; i < n; i++){
            Sushi s = sushi.get(i);
            now += s.cal;
            ans = Math.max(ans,now-s.dist);
            if(ansccw < now-s.dist){
                ansccw = now-s.dist;
                ccw_i = i;
                ccw_li.add(new Ccw(s.dist, ansccw));
            }else{
                if(ccw_li.size() == 0){
                    ccw_li.add(new Ccw(0,0));
                }else{
                    ccw_li.add(ccw_li.get(i-1));
                }
            }
        }
        now = 0;
        for(int i = n-1; i >= 0; i--){
            Sushi s = sushi.get(i);
            now += s.cal;
            ans = Math.max(ans,now-(circle - s.dist));
            if(i != 0){
                Ccw c = ccw_li.get(i-1);
                ans = Math.max(ans,c.cal - c.dist + now - (circle - s.dist));
                ans = Math.max(ans,c.cal + now - (circle - s.dist) * 2);
            }
        }
        System.out.println(ans);
    }
}

class Sushi{
    long dist,cal;
    public Sushi(long d, long c){
        this.dist = d;
        this.cal = c;
    }
}

class Ccw{
    int index;
    long dist,cal;
    public Ccw(long d, long c){
        this.dist = d;
        this.cal = c;
    }
}