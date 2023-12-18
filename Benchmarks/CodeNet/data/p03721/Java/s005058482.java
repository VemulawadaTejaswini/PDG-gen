import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long k = sc.nextLong();
      int[] a = new int[n];
      int[] b = new int[n];
      long sum = 0;
      TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
      for(int i = 0;i < n;i++){
        a[i]=sc.nextInt();
        b[i]=sc.nextInt();
        if(map.containsKey(a[i])){
          int k = map.get(a[i]);
          map.remove(a[i]);
          map.put(a[i],k+b[i]);
        }
        else map.put(a[i],b[i]);
      }
      Arrays.sort(a);
      int s = 0;
      while(sum < k){
      	sum += (long)map.get(a[s]);
        s++;
      }
      System.out.println(a[s-1]);
    }
}
