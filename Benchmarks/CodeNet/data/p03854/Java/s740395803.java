
	
	   
	   
import java.util.*;
 
public class Main {
 static HashMap<String,Boolean> jk=new HashMap<String,Boolean>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   String s=sc.next();
	   HashSet<String> h=new HashSet<String>();
	   h.add("dream");
	   h.add("dreamer");
	   h.add("erase");
	   h.add("eraser");
	   boolean k=compute(s,h);
	   if(k)
	   System.out.println("YES");
	   else
	   System.out.println("NO");}
	   
	   public static boolean compute(String s,HashSet<String> h)
	   {
	       if(jk.containsKey(s))
	       return jk.get(s);
	       else{
	       if(s.length()==0)
	       return true;
	       else{
	           boolean gh=false;
	       
	           if(i+5<=s.length()&&h.contains(s.substring(0,i+5)))
	           {
	               if(i+5<s.length())
	           gh=gh||compute(s.substring(i+5),h);
	           }
	           if(i+6<=s.length()&&h.contains(s.substring(0,i+6))
	           {
	               if(i+6<s.length())
	           gh=gh||compute(s.substring(i+6),h);
	           }
	       
	       jk.put(s,gh);
	       return gh;
	       }}
	   }}
	   
	   
	   