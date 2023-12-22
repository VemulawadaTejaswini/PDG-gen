import java.util.*;

public class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n--!=0){
	    String line = sc.next();
	    char[] c = line.toCharArray();

	    boolean consec = false;
	    boolean lf = true, rf = true;
	    char last = 'a';
	    for(int i=0; i<c.length; i++){
		if(c[i]==last) consec = true;
		last = c[i];
		if((i%2==0 && c[i]=='R') || (i%2!=0 && c[i]=='L')) lf = false;	
		if((i%2==0 && c[i]=='L') || (i%2!=0 && c[i]=='R')) rf = false;
	    }

	    if(!consec && (lf || rf)) System.out.println("Yes");
	    else System.out.println("No");
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}