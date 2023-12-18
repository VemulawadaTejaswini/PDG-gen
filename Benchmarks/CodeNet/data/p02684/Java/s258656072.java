import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt();
        long K=sc.nextLong();
        LinkedHashMap<Integer,Integer> m=new LinkedHashMap<>();
        if(N<K){
            int s=0,e=0,si=00,ei=0;
            for(int i=1;i<=N;i++){
                m.put(i,sc.nextInt());
                if(m.containsValue(i)){
                    s=m.get(i);
                    e=i;
                }
            }
            for(int i:m.keySet()){
                if(i==s){
                    si=i;
                }
                if(i==e){
                    ei=i;
                }
                if(si!=0&&ei!=0){
                    break;
                }
            }
            K-=si;
            K%=(ei-si+1);
            int k=(int)K,t=si;
            for(int i=0;i<k-1;i++){
                t=m.get(t);
            }
            System.out.println(t);
        }
        else{
            int k=(int)K,t=1;
            for(int i=0;i<N;i++){
                m.put(i,sc.nextInt());
            }
            for(int i=0;i<k;i++){
                t=m.get(t);
            }
            System.out.println(t);
        }
    }
}
