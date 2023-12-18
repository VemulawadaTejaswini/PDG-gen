import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      Set<Integer> set = new HashSet<Inetger>();
      int n = sc.nextInt();
      for(int i = 0;i < n;i++){
      	int a = sc.nextInt();
        if(set.contains(a))set.remove(a);
        else set.add(a);
      }
      System.out.println(set.size());
    }
}