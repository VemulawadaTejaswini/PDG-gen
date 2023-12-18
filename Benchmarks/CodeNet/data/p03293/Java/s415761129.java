import java.util. *;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String ans = "No";
	String s = sc.next();
	String t = sc.next();
	t += t;
	if(t.contains(s)) ans = "Yes";
	System.out.println(ans);
    }
}
