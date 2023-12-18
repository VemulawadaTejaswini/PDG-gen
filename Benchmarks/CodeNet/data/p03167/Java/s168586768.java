

import java.io.*;

import java.util.*;



public class Main {



	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		PrintWriter pw = new PrintWriter(System.out);

		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] m=new int[r][c];
		for(int i=0;i<r;i++){
		        String s=sc.nextLine();
		        s=s.trim();
		        for(int j=0;j<s.length();j++)
		        if(s.charAt(j)=='.'){
		            m[i][j]=0;
		        }
		        else if(s.charAt(j)=='#')m[i][j]=1;
		}
		
        pw.println((long)(solve(m)%(1e9+7)));
		pw.close();

	}
	public static double solve(int[][] obstacle_Grid) {
		int m = obstacle_Grid.length;
		if (m <= 0) {
			return 0;//345263555
		}
		int n = obstacle_Grid[0].length;
		if (n <= 0) {
			return 0;
		}
		double[][] dp = new double[m + 1][n + 1];
		dp[m][n - 1] = 1;
		for (int i = m - 1; i >= 0; --i) {
			for (int j = n - 1; j >= 0; --j) {
				dp[i][j] = (obstacle_Grid[i][j] == 0) ? dp[i + 1][j] + dp[i][j + 1] : 0;
			}
		}
		return dp[0][0];
	}
public static boolean prime(int x){
	    int[] arr=new int[10000000];
	    int index=0;
	    int num=3;
	    int i=0;
	    arr[0]=2;
	    while(num<=x){
	      for(i=0;i<=index;i++){
	          if(num%arr[i]==0){
	              break;
	          }
	      }
	      if(i==index+1){
	          arr[++index]=num;
	      }
	      num++;
	    }
	    if(arr[index]==x)return true;
	    return false;
	      
	}
public static void conquer(int[] arr,int b,int m,int e){
	    int len1=m-b+1;
	    int len2=e-m;
	    int[] l=new int[len1];
	    int[] r=new int[len2];
	    for(int i=0;i<len1;i++){
	        l[i]=arr[b+i];
	    }
	   for(int j=0;j<len2;j++){
	            r[j]=arr[m+1+j];
	   }
	    int i=0,j=0,k=b;
	    while((i<len1)&&(j<len2)){
	        if(r[j]>=l[i]){
	            arr[k]=l[i];
	            k++;
	            i++;
	        }
	        else{
	           arr[k]=r[j];
	           k++;
	           j++;
	        }
	    }
	    while(i<len1){
	        arr[k++]=l[i++];
	    }
	    while(j<len2){
	        arr[k++]=r[j++];
	    }
	}
	static int mid;
	public static void sort(int[] arr,int b,int e){
	    if(b<e){
	        int mid =(e+b)/2;
	        sort(arr,b,mid);
	        sort(arr,mid+1,e);
	        conquer(arr,b,mid,e);
	    }
	}
    public static void Sort(int[] arr){
        sort(arr,0,arr.length-1);
    }

	static class Scanner {

		StringTokenizer st;

		BufferedReader br;



		public Scanner(InputStream s) {

			br = new BufferedReader(new InputStreamReader(s));

		}



		public Scanner(String file) throws FileNotFoundException {

			br = new BufferedReader(new FileReader(file));

		}



		public String next() throws IOException {

			while (st == null || !st.hasMoreTokens())

				st = new StringTokenizer(br.readLine());

			return st.nextToken();

		}



		public int nextInt() throws IOException {

			return Integer.parseInt(next());

		}



		public long nextLong() throws IOException {

			return Long.parseLong(next());

		}



		public String nextLine() throws IOException {

			return br.readLine();

		}



		public double nextDouble() throws IOException {

			return Double.parseDouble(next());

		}



		public boolean ready() throws IOException {

			return br.ready();

		}



	}

}

