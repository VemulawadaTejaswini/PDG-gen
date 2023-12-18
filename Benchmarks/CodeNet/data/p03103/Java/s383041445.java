import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long a[]=new long[n];
        long b[]=new long[n];
        Map<Long,Long>map=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            b[i]=sc.nextLong();
            if(map.containsKey(a[i])){
                map.put(a[i],b[i]+map.get(a[i]));
            }else{
                map.put(a[i],b[i]);
            }
        }
        
        Arrays.sort(a);
        long total=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                if(m>map.get(a[i])){
                    m-=map.get(a[i]);
                    total+=a[i]*map.get(a[i]);
                }else{
                    total+=m*a[i];
                    break;
                }
            }
        }
        System.out.println(total);

    }
}