import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){
	    String str = sc.next();
	    char[] c = str.toCharArray();

	    int[] aa = new int[n];
	    int[] bb = new int[n];
	    for(int i=0; i<n; i++){
		aa[i] = sc.nextInt();
		bb[i] = sc.nextInt();
	    }

	    for(int i=n-1; i>=0; i--){
		int a = aa[i];
		int b = bb[i]; 

		int diff = b-a;
		//if(c[a-1]+diff>'z'){c[a-1] = (char)(c[a-1]+diff-26);}
		//else {c[a-1] = (char)(c[a-1]+diff);}
		c[a-1] = (char)((c[a-1]-'a'+diff)%26 + 'a');

		//if(c[b-1]+diff>'z'){c[b-1] = (char)(c[b-1]+diff-26);}
		//else {c[b-1] = (char)(c[b-1]+diff);}
		c[b-1] = (char)((c[b-1]-'a'+diff)%26 + 'a');

		char tmp = c[a-1];
		c[a-1] = c[b-1];
		c[b-1] = tmp;

	    }
	    System.out.println(new String(c));
	    n = sc.nextInt();
	}
    }
}