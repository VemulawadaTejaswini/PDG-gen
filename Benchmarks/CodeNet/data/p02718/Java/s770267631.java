
import java.lang.Math;
import java.util.Collections;
import java.util. ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> a = new ArrayList<>();
        while(sc.hasNext()== true ){
            a.add(sc.nextLong());
        }
        long sumo = 0;
        for (int i =0; i<a.size(); i++){
            sumo += a.get(i);
        }
        long n = a.get(0);
        long m = a.get(1);
        String ans = null;
        sumo = sumo - (n + m);
        int cnt = 0;
        //sumoがaの総和になった
        //ここから最大値をm個とる
        for (long i=0; i < m; i++){
            long b = Collections.max(a);
            if (b*4*m >= sumo){
                cnt +=1;
                a.remove(a.indexOf(b));
            }else{
                a.remove(a.indexOf(b));
            }
        }
        if (cnt >= m){
            ans = "Yes";
        }else{
            ans ="No";
        }
        System.out.println(ans);
    }
}
