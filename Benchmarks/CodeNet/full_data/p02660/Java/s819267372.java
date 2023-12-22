import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        long N=sc.nextLong();
        HashMap<Integer,Integer>c=new HashMap<>();
        for(int i=2;N!=1;i++){
            if(N%i==0){
                int s=0;
                while(N%i==0){
                    N/=i;
                    s++;
                }
                c.put(i,s);
            }
        }
        int res=0;
        for(int i:c.keySet()){
            int t=c.get(i);
            int s=1;
            while(t>=s){
                t-=s;
                res++;
                s++;
            }
        }
        System.out.println(res);
    }
}