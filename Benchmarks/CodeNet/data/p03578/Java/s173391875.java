import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++) {
    	int buff=sc.nextInt();
    	if(map.get(buff)!=null)map.put(buff, map.get(buff)+1);
    	else map.put(buff, 1);
    }
    int m=sc.nextInt();
    for(int i=0;i<m;i++) {
    	int buff=sc.nextInt();
    	map.put(buff, map.get(buff)-1);
    	
    	if(map.get(buff)<0) {
    		System.out.println("NO");
    		System.exit(0);
    	}
    }
    System.out.println("YES");
  }
}
