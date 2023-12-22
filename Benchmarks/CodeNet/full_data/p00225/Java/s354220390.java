import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    String s;
    int[] start, end;
    boolean ans;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;

	    start = new int[26];
	    end = new int[26];
	    ans = true;

	    for(int i=0; i<n; i++){
		s = sc.next();
		char[] c = s.toCharArray();
		// System.out.println((c[0]+'0')+" "+(c[c.length-1]+'0'));
		
		start[c[0]+'0'-145]++;
		end[c[c.length-1]+'0'-145]++;
		
	    }

	    for(int i=0; i<start.length; i++)
		ans = (ans && (start[i]==end[i]));

	    System.out.println(ans ? "OK" : "NG");
	}
    }
}