import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        PriorityQueue<Po>queue=new PriorityQueue<>(new Comparator<Po>(){
            public int compare(Po a,Po b){
                return -(a.b-b.b);
            }
        });
        ArrayList<Po>po=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            Po p=new Po(sc.nextInt(),sc.nextInt());
            po.add(p);
        }
        Collections.sort(po,new Comparator<Po>(){
            public int compare(Po a,Po b){
                return a.a-b.a;
            }
        });
        int index=0;
        long ans=0;
        for(int i=1;i<=m;i++){
            while(index<po.size()&&po.get(index).a<=i){
                queue.add(po.get(index));
                index++;
            }
            if(queue.size()!=0)ans+=queue.poll().b;
        }
        System.out.println(ans);
    }
    
}class Po{
        int a,b;
        public Po(int x,int y){
            a=x;
            b=y;
        }
        public String toString(){
            return a+" "+b;
        }
    }
