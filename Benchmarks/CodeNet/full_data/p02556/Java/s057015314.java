

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        Pair[] pairs=new Pair[n];
        for(int i=0;i<n;i++){
            String[] s=br.readLine().split(" ");
            int x=Integer.parseInt(s[0].trim());
            int y=Integer.parseInt(s[1].trim());
            pairs[i]=new Pair(x,y);
        }

        Arrays.sort(pairs);
        int r=Math.abs(pairs[n-1].x-pairs[0].x)+Math.abs(pairs[0].y-pairs[n-1].y);
        System.out.println(r);

    }


}
class Pair implements Comparable<Pair>{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }


    @Override
    public int compareTo(Pair o) {
        return o.x-o.y;
    }
}
