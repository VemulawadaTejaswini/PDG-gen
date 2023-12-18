import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> map = new TreeMap<>();
        int[] p = new int[m];
        int[] y = new int[m];
        for (int i=0;i<m;i++){
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
            map.put(y[i],i);
        }
        int[] orderP = new int[n];
        int[] num    = new int[m];
        for (int k:map.keySet()){
            int prefecture = p[map.get(k)];
            orderP[prefecture-1]++;
            num[map.get(k)]=orderP[prefecture-1];
        }
        for (int i=0;i<m;i++){
            System.out.println(String.format("%06d",p[i])+String.format("%06d",num[i]));
        }
    }
}