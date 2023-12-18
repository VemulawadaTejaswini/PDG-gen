import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Integer> set = new HashSet<Integer>();
	int cnt = 1;
	int s = sc.nextInt();
	int ns = (s%2 == 0)?s/2: 3*s+1;
	while(true) {
	    if(set.contains(s)) break;
	    set.add(s);
	    cnt++;
	    s = ns;
	    ns = (s%2 == 0)?s/2: 3*s+1;
	}
	System.out.println(cnt);
    }
}