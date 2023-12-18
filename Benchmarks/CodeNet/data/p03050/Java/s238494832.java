import java.util.*;

public class Main {
    static ArrayList<Long> l=new ArrayList<>();
    static Map<Long,Integer> map;
    static long[]aa;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=Long.parseLong(sc.next());
        long po=n;
        long ans=0;
       map=new HashMap<>();
       
        for(long i=2;i*i<=n;i++){
            while(n%i==0){
                if(map.containsKey(new Long(i))){
                    map.put(i,map.get(i)+1);
                }
                else {
                    map.put(i,1);
                }
                n/=i;
            }
        }
        if(n!=1)map.put(n,1);
        aa=new long[map.size()];
        int index=0;
        for(Long key:map.keySet()){
            aa[index++]=key;
        }
        popo(map.size()-1,1);
        
        Collections.sort(l);
        for(int i=0;i<l.size()/2;i++){
            long a=Long.parseLong(l.get(l.size()-1-i)+"")-1;
            if(po%a==po/a)ans+=a;
        }
        System.out.println(ans);
    }
    public static void popo(int size,long value){
        if(size<0){
            l.add(value);
        }
        else{
            for(int i=0;i<Integer.parseInt(map.get(aa[size])+"");i++){
            if(i==0){
                popo(size-1,value);
            }
            popo(size-1,value*aa[size]);
            value*=aa[size];
        }
        }
    }
}
