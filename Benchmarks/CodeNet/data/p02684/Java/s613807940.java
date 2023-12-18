import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),t=1,s=0,a=0;
        long K=sc.nextLong();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=1;i<=N;i++){
            a=sc.nextInt();
            if(m.containsKey(a)&&s==0){
                s=a;
            }
            m.put(i,a);
        }
        a=0;
        while(t!=s){
            a++;
            t=m.get(t);
        }
        K-=a;
        a=0;
        do{
            a++;
            t=m.get(t);
        } while(t!=s);
        K%=a;
        int k=(int)K;
        for(int i=0;i<k;i++){
            t=m.get(t);
        }
        System.out.println(t);
    }
}
