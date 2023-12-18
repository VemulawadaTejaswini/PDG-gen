import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = sc.next().split("");
		Map map = new HashMap();
		for (int n0=0; n0<n-2; n0++) {
		    for (int n1=n0+1; n1<n-1; n1++) {
		        for (int n2=n1+1; n2<n; n2++) {
		            if (n0 != n1 && n1 != n2 && n0 != n2) {
		                String str = s[n0] + s[n1] + s[n2];
		                map.put(str,str);
		            }
		        }
		    }
		}
		System.out.println("" + map.size());
    }
}