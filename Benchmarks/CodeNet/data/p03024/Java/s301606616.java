import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int nitime = s.length();
	int ans = (15-nitime)+ s.replace("x","").length();

	if(ans >= 8)System.out.println("YES");
	else System.out.println("NO");
    }
}