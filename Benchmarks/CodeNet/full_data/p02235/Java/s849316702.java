/*
17D8101031C 杉山　祥吾 ID:keisei334 java
*/

import java.util.Scanner;

class Main{
    public static void main(String[] av){
	Scanner sc=new Scanner(System.in);
	int q=sc.nextInt();
	int[] ans=new int[q];

	for(int p=0;p<q;p++){
	    String s1=sc.next();
	    String s2=sc.next();
	    int m=s1.length();
	    int n=s2.length();
	    int[][] len=new int[m+1][n+1];

	    for(int i=0;i<=m;i++) len[i][0]=0;
	    for(int j=0;j<=n;j++) len[0][j]=0;

	    for(int i=1;i<=m;i++){
		for(int j=1;j<=n;j++){
		    if(s1.charAt(i-1)==s2.charAt(j-1)){
			len[i][j]=len[i-1][j-1]+1;
		    }else{
			len[i][j]=Math.max(len[i][j-1],len[i-1][j]);
		    }
		}
	    }

	    ans[p]=len[m][n];
	}

	for(int p=0;p<q;p++){
	    System.out.println(ans[p]);
	}
    }
}

/*実行結果

*/

