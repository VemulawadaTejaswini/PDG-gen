import java.util.*;

public class Main{
    static final int m_max=2001, s_max=3001;

    public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	int[][][] table = new int[2][m_max][s_max];
	int n,m,s;

	while(true){
	n = scn.nextInt();
	n = n*n;
	m = scn.nextInt();
	s = scn.nextInt();

	if(n==0&&m==0&&s==0) break;

	for(int i=1; i<=m; i++) for(int j=1; j<=n; j++)
		table[0][i][j] = (i >= j)?1:0;

	for(int i=1; i<n; i++) for(int j=1; j<=m; j++) for(int k=1; k<=s; k++)
		    if((j*2-i)*(i+1)/2 < k || j==1){
			table[i&1][j][k] = 0;
		    }else if(k <= j){
			table[i&1][j][k] = table[i&1][j-1][k];
		    }else{
			table[i&1][j][k] = (table[i&1][j-1][k] + table[~i&1][j-1][k-j])%100000;
		    }

	System.out.println(table[~n&1][m][s]);
	}
    }
}