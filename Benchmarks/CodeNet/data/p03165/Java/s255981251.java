import java.util.Scanner;

class Solution{

	public static  int maxi(int a,int b){
        if(a >= b) return a;
        else return b;
    }


    public static String LCS(String s,String t){
        int n = s.length();
        int m = t.length();

        int[][] arr = new int[n+1][];

        for(int i = 0;i <= n;i++){
            arr[i] = new int[m+1];
        }

        for(int i = 0;i <= n;i++){
            arr[i][0] = 0;
        }

        for(int i = 0;i <= m;i++){
            arr[0][i] = 0;
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(s.charAt(i) == t.charAt(j)){
                    arr[i+1][j+1] = arr[i][j]+1;
                }

                else{
                    arr[i+1][j+1] = maxi(arr[i+1][j], arr[i][j+1]);
                }
            }
        }


        String res = "";

        int r = n, c = m;
        
        while(res.length() < arr[n][m]){

        	if(arr[r][c] == arr[r-1][c]){
        		r = r-1;
        	}

        	else if(arr[r][c] == arr[r][c-1]){
        		c = c-1;
        	}

        	else{
        		res = res + s.charAt(r-1);
        		r = r-1;
        		c = c-1;
        	
        	}
        	
        }

        return res;
    }

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		String s,t;

		s = in.next();
		t = in.next();

		String ans = LCS(s,t);

		StringBuilder ans1 = new StringBuilder();

		System.out.println(ans);

		ans1.append(ans);

		ans1 = ans1.reverse(); 

		System.out.println(ans1);
	}
}