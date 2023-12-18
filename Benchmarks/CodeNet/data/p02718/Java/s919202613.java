
import java.util.Collections;
import java.util. ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        while(sc.hasNext()== true ){
            a.add(sc.nextInt());
        }
        int sumo = 0;
        for (int i =0; i<a.size(); i++){
            sumo += a.get(i);
        }
        int n = a.get(0);
        int m = a.get(1);
        String ans = null;
        sumo = sumo - n - m;
        //sumoがaの総和になった
        //ここから最大値をm個とる
        int thres = sumo/(4*m);
        for (int i=0; i <= m; i++){
            int b = Collections.max(a);
            if (b < thres){
                ans = "No";
            }else{
                ans = "Yes";
            }
            a.remove(a.indexOf(b));
        }
        System.out.println(ans);
    }
}
