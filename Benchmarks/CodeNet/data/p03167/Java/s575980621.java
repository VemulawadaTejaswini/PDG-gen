import java.io.*;

import java.util.*;



public class Main {

    static 	PrintWriter pw = new PrintWriter(System.out);

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

	

		r=sc.nextInt();
		c=sc.nextInt();
	    m=new int[r][c];
		for(int i=0;i<r;i++){
		        String s=sc.nextLine();
		        s=s.trim();
		        for(int j=0;j<s.length();j++)
		        if(s.charAt(j)=='.'){
		            m[i][j]=0;
		        }
		        else if(s.charAt(j)=='#')m[i][j]=1;
		}
		dp=new long[r+1][c+1];
		for(long[] i:dp){
		    Arrays.fill(i,-1);
		}
        pw.print(solve(0,0));
		pw.close();

	}
	static long[][] dp;
	static int[][] m;
	static int r;
	static int c;
	public static long solve(int i,int j){
	    if(i==r-1&&j==c-1)return 1;
	    if(i==r||j==c){
	        return 0;
	    }
	    if(dp[i][j]!=-1){
	        return dp[i][j];
	    }
	    if(m[i][j]==1){
	        return 0;
	    }
	    return dp[i][j]=(long)((solve(i+1,j)+solve(i,j+1))%(1e9+7));
	}
	public static void print(double[][]arr){
	    for(double[] i:arr){
	        for(double j:i){
	            pw.print(j+" ");
	        }pw.println();
	    }
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