import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
while(!sc.hasNext("0")){
	HashMap<String,String> h = new HashMap<String,String>();
	int n=sc.nextInt();
	for(;n>0;n--) h.put(sc.next(), sc.next());
	int m=sc.nextInt();
	for(;m>0;m--){
	String s=sc.next();
	if(h.containsKey(s))s=h.get(s);
	System.out.print(s);
	}
	System.out.println();
}
}
}