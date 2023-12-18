import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i = 0;i < n;i++){
      	a[i]=sc.nextInt();
        if(map.containsKey(a[i]))map.put(a[i],map.get(a[i])+1);
        else map.put(a[i],1);
      }
      int sum = 0;
      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
      	int x = entry.getKey();
        int y = entry.getValue();
        if(x>=y)sum+=y;
        else sum+=y-x;
      }
      System.out.println(sum);
    }
}