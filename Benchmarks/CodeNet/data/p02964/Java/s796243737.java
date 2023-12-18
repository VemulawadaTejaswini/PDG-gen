import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String ,Integer>map=new HashMap<>();
        boolean c=false;
        int n=sc.nextInt();
        long k=Long.parseLong(sc.next());
        int []a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<String>aaa=new ArrayList<>();
        aaa.add(new ArrayList<Integer>().toString());
        map.put(new ArrayList<Integer>().toString(),0);
        long h=0;
        long g=0;
        for(long i=1;i<=k;i++){
            for(int j=0;j<n;j++){
                int ind=arr.indexOf(a[j]);
                if(ind!=-1){
                    arr.subList(ind, arr.size()).clear();
                }
                else
                    arr.add(a[j]);
            }
            if(map.containsKey(arr.toString())){
                h=i;
                g=map.get(arr.toString());
                break;
            }
            aaa.add(arr.toString());
            map.put(arr.toString(),(int)i);
        }
        int f=(int)(h-g);
        long nn=k-g;
        nn%=f;
        
        System.out.println(aaa.get((int)g+(int)nn).replace("[","").replace("]","").replace(",",""));
        /*System.out.println(h+" "+g);
        System.out.println("size="+map.size());
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }*/
        
    }
}
