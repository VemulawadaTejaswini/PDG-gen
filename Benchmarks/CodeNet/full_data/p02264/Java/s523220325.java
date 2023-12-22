import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        int q = Integer.parseInt(t[1]);
        ArrayDeque<P> Q = new ArrayDeque<P>();
        for(int i = 0; i < n; i++){
            t = br.readLine().split(" ");
            P p = new P();
            p.name = t[0];
            p.time = Integer.parseInt(t[1]);
            Q.addLast(p);
        }
        int sumTime = 0;
        StringBuilder sb = new StringBuilder();
        while(!Q.isEmpty()){
            P p = new P();
            p = Q.pollFirst();
            //p.time = p.time - q;                                                   
            if(p.time - q <= 0){
                sumTime += p.time;
                sb.append(p.name).append(" ").append(sumTime).append("\n");
            }else if(p.time - q > 0){
                p.time = p.time - q;
                Q.addLast(p);
                sumTime = sumTime + q;
            }
        }
        System.out.print(sb);
    }

}

class P{
    String name;
    int time;
}