import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); ///nodes
        int M = in.nextInt();//edge
        int [] arr = new int[N+1];
        int i=1;
        while(in.hasNextInt()){
            arr[i++]  = in.nextInt();
        }
            BitSet bit = new BitSet(N+1);
            for(i=1;i<=N;i++)
            bit.set(i,true);
        for( i=0;i<M;i++){
            int u= in.nextInt();
            int v = in.nextInt();
            if(arr[u]==arr[v]){
                bit.set(u, false);
                bit.set(v, false);
            }
            else if( arr[u]<arr[v]){
                bit.set(u,false);
            }else{
                bit.set(v, true);
            }
        }
        System.out.println(bit.cardinality());
        in.close();
    }
}