import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	static Map<Long,Long> map= new TreeMap<>();
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long a=sc.nextLong(),v=sc.nextLong(),b=sc.nextLong(),w=sc.nextLong(),t=sc.nextLong();
	  long s=Math.abs(a-b),h=v-w;
	  if(h*t>=s) {
		  System.out.println("YES");
	  }else {
		  System.out.println("NO");
	  }
  }
}

