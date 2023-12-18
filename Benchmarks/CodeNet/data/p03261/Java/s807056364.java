import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	HashSet<String> set = new HashSet<String>();
	String[] a = new String[n];
	for(int i = 0; i<n; i++) {
	    String str = sc.next();
	    set.add(str);
	    a[i] = str;
	    if(i!=0) {
		if(a[i].charAt(0) != a[i-1].charAt(a[i-1].length()-1)) {
			System.out.println("No");
			return;
		    }
		}
	}
	if(set.size()!=n) {
	    System.out.println("No");
	    return;
	}
	System.out.println("Yes");

    }
}