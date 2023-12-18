import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      int[] a = new int[n];
      for(int i = 0;i < n;i++){
        a[i]=sc.nextInt();
        map.put(a[i],sc.nextInt());
      }
      Arrays.sort(a);
      System.out.println(a[n-1]+map.get(a[n-1]));
    }
}