import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<trip> ll;
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] ss=br.readLine().split(" ");
            int a=Integer.parseInt(ss[0]);
            int b=Integer.parseInt(ss[1]);
            if(a<b){
                System.out.println(0);
            }else{
                System.out.println(10);
            }

        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }

    static class trip{
        int lev,node,child;
        public trip(int lev,int node,int child){
            this.lev=lev;
            this.node=node;
            this.child=child;
        }
    }
    static void bfs(ArrayList<ArrayList<Integer>> list){
        Queue<trip> q=new ArrayDeque<>();
        q.add(new trip(0,0,list.get(0).size()));
        boolean[] brr=new boolean[list.size()];
        brr[0]=true;
        while(q.size()>0){
            trip t=q.poll();
            if(t.child==0) {
                ll.add(t);
            }

            int node=t.node;
            for(int i=0;i<list.get(node).size();i++){
                int u=list.get(node).get(i);
                if(!brr[u]){
                    q.add(new trip(t.lev+1,u,list.get(u).size()));
                    brr[u]=true;
                }
            }
        }
    }
    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
