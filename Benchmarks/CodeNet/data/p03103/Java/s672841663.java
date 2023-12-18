import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        int N=sc.nextInt(),M=sc.nextInt(),i=0,c;
        long a;
        TreeMap<Integer,Long> cost=new TreeMap<>();
        for(i=0;i<N;i++){
            c=sc.nextInt();
            a=sc.nextInt();
            if(!cost.containsKey(c)){
                cost.put(c,a);
            }else{
                cost.put(c,cost.get(c)+a);
            }
        }
        a=0;
        for(int k:cost.keySet()){
            long m=Math.min(M,cost.get(k));
            a+=k*m;
            M-=m;
            if(M==0)break;
        }
        System.out.println(a);
    }
}
