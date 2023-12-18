import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  String s=sc.next(),f="",g="";
	  StringBuilder buff=new StringBuilder();
	  Set<String> set=new HashSet<>();
	  Map<Integer,String>map1=new TreeMap<>();
	  Map<Integer,String>map2=new TreeMap<>();
	  for(int i=1;i<n-1;i++) {
		  buff.setLength(0);
		  s.substring(i+1,n).chars().distinct().forEach(c->buff.append((char)c));
		  map1.put(i, buff.toString());
	  }
	  for(int i=0;i<n-1;i++) {
		  buff.setLength(0);
		  s.substring(i+1,n).chars().distinct().forEach(c->buff.append((char)c));
		  map2.put(i, buff.toString());
	  }
	  for(int i=0;i<n-2;i++) {
		  g=map2.get(i);
		  for(int j=i+1;j<n-1;j++) {
			  f=map1.get(j);
			  for(int k=0;k<f.length();k++) {
				  set.add(s.substring(i, i+1)+s.substring(j, j+1)+f.substring(k, k+1));
				  //System.out.println(s.substring(i, i+1)+s.substring(j, j+1)+f.substring(k, k+1));
			  }
		  }
	  }
	  System.out.println(set.size());
  }
}
