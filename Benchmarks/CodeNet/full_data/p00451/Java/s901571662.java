import java.util.Scanner;

public class Main{
    public Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String st = sc.next();
	    char[] s = st.toCharArray();
	    st = sc.next();
	    char[] t = st.toCharArray();
	    int n = s.length;
	    int m = t.length;
	    int a[][] = new int[n+1][];
	    int b[][] = new int[n+1][];
	    a[0] = new int[m+1];
	    b[0] = new int[m+1];
	    int max = 0;

	    for(int i = 0; i < n; i++){
		a[i+1] = new int[m+1];
		b[i+1] = new int[m+1];
		for(int j = 0; j < m; j++){
		    if(s[i] == t[j]){
			if(b[i][j] == 1){
			    a[i+1][j+1] = a[i][j] + 1;
			} else {
			    a[i+1][j+1] = 1;
			}
			b[i+1][j+1] = 1;
		    } else {
			if(a[i+1][j] > a[i][j+1]){
			    a[i+1][j+1] = a[i+1][j];
			} else {
			    a[i+1][j+1] = a[i][j+1];
			}
		    }
		}
	    }
	    for(int i = 1; i <= m; i++){
		if(max < a[n][i]){
		    max = a[n][i];
		}
	    }
	    System.out.println(Integer.toString(max));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}