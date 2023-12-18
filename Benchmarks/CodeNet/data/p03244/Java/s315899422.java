import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer>e=new HashMap<>();
        Map<Integer,Integer>o=new HashMap<>();
        for(int i=0;i<n;i+=2){
            int po=sc.nextInt();
            if(e.containsKey(po))e.put(po,e.get(po)+1);
            else e.put(po,1);
            po=sc.nextInt();
            if(o.containsKey(po))o.put(po,o.get(po)+1);
            else o.put(po,1);
        }
        int maxe=0;
        int max2e=0;
        int eind=0;
        int oind=0;
        for(Integer i:e.keySet()){
            if(e.get(i)>=maxe){
                max2e=maxe;
                maxe=e.get(i);
                eind=i;
            }
        }
        int maxo=0;
        int max2o=0;
        for(Integer i:o.keySet()){
            if(o.get(i)>=maxo){
                max2o=maxo;
                maxo=o.get(i);
                oind=i;
            }
        }
        System.out.println((oind==eind)?Math.min(n-maxo-max2e,n-max2o-maxe):n-maxo-maxe);
    }
}
