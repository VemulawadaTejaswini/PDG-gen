import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        TreeMap<Integer,Integer> map1=new TreeMap<>();
        TreeMap<Integer,Integer> map2=new TreeMap<>();
        int max1=-1,max2=-1,a1=-1,a2=-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
               
                if(map1.containsKey(ar[i])){
                    int x=map1.get(ar[i]);
                    map1.put(ar[i],++x);
                }
                else{
                    map1.put(ar[i],1);
                }
                max1=Math.max(max1,map1.get(ar[i]));
                a1=ar[i];
            }
            else{
                
                if(map2.containsKey(ar[i])){
                    int x=map2.get(ar[i]);
                    map2.put(ar[i],++x);
                }
                else{
                    map2.put(ar[i],1);
                }
                max2=Math.max(max2,map2.get(ar[i]));
                a2=ar[i];
            }
        }
        if(a1==a2){
            System.out.println(n/2);
            
        }
        else{
        //System.out.println("max1="+max1+"max2="+max2);
            System.out.println(n-(max1+max2));
        }    
    }
}