import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  String s=sc.next();
	  StringBuilder buff=new StringBuilder();
	  Set<String> res=new HashSet<>();
	  Set<String> buff1=new HashSet<>();
	  Set<String> buff2=new HashSet<>();

	  for(int i=0;i<n-2;i++) {
		  for(int j=i+1;j<n-1;j++) {
			  if(!buff1.add(s.substring(j, j+1)))continue;
			  buff1.add(s.substring(j, j+1));
			  for(int k=j+1;k<n;k++) {
				  if(!buff2.add(s.substring(k, k+1)))continue;
				  buff2.add(s.substring(k, k+1));
				  res.add(s.substring(i, i+1)+s.substring(j, j+1)+s.substring(k, k+1));
				  //System.out.println(s.substring(i, i+1)+s.substring(j, j+1)+s.substring(k, k+1));
			  }
			  buff2.clear();
		  }
		  buff1.clear();
	  }
	  System.out.println(res.size());
  }
}
