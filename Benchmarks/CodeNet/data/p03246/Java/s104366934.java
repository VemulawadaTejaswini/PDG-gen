import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        for(int i=0;i<n;++i){N[i]=sc.nextInt();}

        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<n;i=i+2){
            map1.put(N[i],map1.getOrDefault(N[i],0)+1);
        }
        for(int i=1;i<n;i=i+2){
            map2.put(N[i],map2.getOrDefault(N[i],0)+1);
        }
        //for(int a:map1.keySet()) System.out.println(a + "   "+map1.get(a));
        //for(int a:map2.keySet()) System.out.println(a + "   "+map2.get(a));
        //.
        int max1 = 0;
        int maxidx1 = 0;
        for(int a:map1.keySet()) if (map1.get(a)>max1) {max1=map1.get(a);maxidx1=a;}
        //.
        int max2 = 0;
        int maxidx2 = 0;
        for(int a:map2.keySet()) if (map2.get(a)>max2) {max2=map2.get(a);maxidx2=a;}

        if (maxidx1!=maxidx2) {System.out.println(n-max1-max2);return;}

        int secmax1 = 0;
        int secmaxidx1 = 0;
        for(int a:map1.keySet()) {if (a==maxidx1) continue; if (map1.get(a)>secmax1) {secmax1=map1.get(a);secmaxidx1=a;}}

        int secmax2 = 0;
        int secmaxidx2 = 0;
        for(int a:map2.keySet()) {if (a==maxidx2) continue; if (map2.get(a)>secmax2) {secmax2=map2.get(a);secmaxidx2=a;}}
        System.out.println(Math.min(n-max1-secmax2,n-max2-secmax1));
    }
}
