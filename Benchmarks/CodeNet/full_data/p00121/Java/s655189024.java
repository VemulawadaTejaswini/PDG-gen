import java.util.*;
import java.nio.*;
public class Main{
    public static void main(String[] args){
        int n=8;
        int s[]=new int[n];
        for(int i=0;i<n;i++)s[i]=i;
        Deque<IntBuffer>que=new ArrayDeque<>();
        que.add(IntBuffer.wrap(s));
        Map<IntBuffer,Integer>m=new TreeMap<>();
        m.put(IntBuffer.wrap(s),0);
        int idx=0;
        while(!que.isEmpty()){
            idx++;
            int v[]=que.remove().array();
            int c=0;
            for(int i=0;i<n;i++)if(v[i]==0)c=i;
            {
                int v2[]=v.clone();
                v2[c]^=v2[c^4];
                v2[c^4]^=v2[c];
                v2[c]^=v2[c^4];
                if(!m.containsKey(IntBuffer.wrap(v2))){
                    m.put(IntBuffer.wrap(v2),m.get(IntBuffer.wrap(v))+1);
                    que.add(IntBuffer.wrap(v2));
                }
            }
            if(c%4!=0){
                int v2[]=v.clone();
                v2[c]^=v2[c-1];
                v2[c-1]^=v2[c];
                v2[c]^=v2[c-1];
                if(!m.containsKey(IntBuffer.wrap(v2))){
                    m.put(IntBuffer.wrap(v2),m.get(IntBuffer.wrap(v))+1);
                    que.add(IntBuffer.wrap(v2));
                }
            }
            if(c%4!=3){
                int v2[]=v.clone();
                v2[c]^=v2[c+1];
                v2[c+1]^=v2[c];
                v2[c]^=v2[c+1];
                if(!m.containsKey(IntBuffer.wrap(v2))){
                    m.put(IntBuffer.wrap(v2),m.get(IntBuffer.wrap(v))+1);
                    que.add(IntBuffer.wrap(v2));
                }
            }
        }
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int v[]=new int[n];
            for(int i=0;i<n;i++)v[i]=sc.nextInt();
            System.out.println(m.get(IntBuffer.wrap(v)));
        }
    }
}
