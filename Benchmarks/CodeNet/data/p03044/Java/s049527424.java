import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n+1];
        Map<Integer,Po>po=new HashMap<>();
        for(int i=0;i<n;i++){
             Po p=new Po();
             po.put(i+1,p);
        }
        for(int i=0;i<n-1;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt()%2;
            po.get(a).put(b,c);
            po.get(b).put(a,c);
            
        }
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        while(queue.size()!=0){
            int ll=queue.poll();
            po.get(ll).dis=false;
            for(int j=0;j<po.get(ll).a.size();j++){
                int xx=po.get(ll).a.get(j);
                int yy=po.get(ll).b.get(j);
                
                //System.out.println(xx+" "+yy+" "+po.get(xx).dis);
                if(po.get(xx).dis){
                    queue.add(xx);
                    ar[xx]+=ar[ll]+yy;
                }
                
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println((ar[i])%2);
        }
    }
    static class Po{
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        public boolean dis=false;
        public Po(){
        a=new ArrayList<>();
        b=new ArrayList<>();
            
            dis=true;
        }
        public Po(int y,int z){
            dis=true;
            a.add(y);
            b.add(z);
        }
        public void put(int a,int b){
            this.a.add(a);
            this.b.add(b);
        }
        public void print(){
            //System.out.println(a+" "+b+" "+value);
        }
    }
    
}
