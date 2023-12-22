import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    static Map<String, String>  con; 
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		con = new HashMap<String, String>();
		String in;
		String out;
		String ans = "";
      		while(n-- != 0){
		    con.put(kbd.next(), kbd.next());
		}

		n = kbd.nextInt();
		for(; n>0; n--){
		    String a = kbd.next();
		    if(con.containsKey(a))  ans += con.get(a);
		    else ans += a;
		}
		System.out.println(ans);
	    }
	}
    }
}