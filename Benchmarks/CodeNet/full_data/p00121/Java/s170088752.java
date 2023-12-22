import java.util.*;
//import java.lang.Math;
public class Main{

    public static int ten[]={1,10,100,1000,10000,100000,1000000,10000000};

    public static int digit(int N,int K){
        return (N/ten[7-K])%10;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer> pz=new HashMap<Integer,Integer>();
        Map<Integer,Boolean> reach=new HashMap<Integer,Boolean>();
        pz.put(1234567,0);
        reach.put(1234567,true);
        Queue<Integer> q=new ArrayDeque<Integer>();
        q.add(1234567);
        while(q.size()>0){
            int now=q.poll();
            int dis=pz.get(now);
            int cnt=0;
            for(int i=0;i<10;i++){
                int p=now;
                if(i<3 ||(i>=4 && i<=6)){
                    int a=digit(p,i);
                    int b=digit(p,i+1);
                    if(a!=0 && b!=0) continue;
                    int minus=a*ten[7-i]+b*ten[7-i-1];
                    p-=minus;
                    p+=b*ten[7-i]+a*ten[7-i-1];
                    if(reach.containsKey(p)) continue;
                    else{
                        pz.put(p,dis+1);
                        reach.put(p,true);
                        q.add(p);
                    }
                }
                else{
                    int a=digit(p,cnt);
                    int b=digit(p,cnt+4);
                    int s=cnt;
                    cnt++;
                    if(a!=0 && b!=0) continue;
                    int minus=a*ten[7-s]+b*ten[7-s-4];
                    p-=minus;
                    p+=b*ten[7-s]+a*ten[7-s-4];
                    if(reach.containsKey(p)) continue;
                    else{
                        pz.put(p,dis+1);
                        reach.put(p,true);
                        q.add(p);
                    }
                }
            }
        }
        while(sc.hasNext()){
            int N=0;
            for(int i=0;i<8;i++){
                int a=sc.nextInt();
                N+=a*ten[7-i];
            }
            System.out.println(pz.get(N));
        }
    }
}
