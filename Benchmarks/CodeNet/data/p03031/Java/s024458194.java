import java.util.*;
import java.lang.*;

class Lamp{
    List<Integer> validSwitch;
    int p;
    public Lamp(List<Integer> validSwitch, int p){
        this.validSwitch = validSwitch;
        this.p = p;
    }
    boolean lighted(long switchSet){
        int cur=p;
        for(int s:validSwitch){
            if((switchSet & (1<<s))!=0) cur++;
        }
        return cur%2==0;
    }
}

public class Main {
    static int popCount(long bits){
        bits = (bits & 0x55555555) + (bits >> 1 & 0x55555555);
        bits = (bits & 0x33333333) + (bits >> 2 & 0x33333333);
        bits = (bits & 0x0f0f0f0f) + (bits >> 4 & 0x0f0f0f0f);
        bits = (bits & 0x00ff00ff) + (bits >> 8 & 0x00ff00ff);
        return (int)((bits & 0x0000ffff) + (bits >>16 & 0x0000ffff));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Lamp[] lamp = new Lamp[M];
        List<Integer>[] validSwitch = new ArrayList[M];
        for(int m=0; m<M; m++){
            int K = sc.nextInt();
            validSwitch[m] = new ArrayList<>(K);
            for(int k=0; k<K; k++) validSwitch[m].add(sc.nextInt()-1);
        }
        for(int m=0; m<M; m++) lamp[m] = new Lamp(validSwitch[m], sc.nextInt());

        long ans=0;
        for(long s=0; s<(1<<N); s++){
            boolean allLight = true;
            for(Lamp l: lamp) if(!l.lighted(s)) allLight=false;
            if(allLight) ans++;
        }
        System.out.println(ans);
    }
}