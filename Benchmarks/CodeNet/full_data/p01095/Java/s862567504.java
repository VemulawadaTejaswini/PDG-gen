import java.util.*;

public class Main {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        int lim=7368792;
        
        BitSet b=new BitSet(lim);
        while(true){
            int m=s.nextInt(),n=s.nextInt();
            if(m+n==0)return;
            
            b.clear();
            
            int v=m;
            for(int i=0;i<n;++i){
                v=b.nextClearBit(v);
                for(int j=v;j<lim;j+=v)
                    b.set(j);
            }
            System.out.println(b.nextClearBit(m));
        }
    }
}

