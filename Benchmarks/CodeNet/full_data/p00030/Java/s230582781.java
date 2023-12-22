import java.util.Scanner;

class Main {
	static int ans=0;
	static int v[]= {0,1,2,3,4,5,6,7,8,9};
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		for(;;) {
			int n=sc.nextInt();//n個選んで
			int m=sc.nextInt(); //mになる
			if(n==0&&m==0)break;  //深さn以下でmになる値
	System.out.println(solve(n,m,0));

		}

		}
	public static int solve(int n,int m,int c){
	    if(n==1) {
	    	if(m>=c&&m<10) {
	    		return 1;
	    	}else return 0;
	    }
	    int ans=0;
	    for(int i=c;i<10&&i<m;i++){
	        ans+=solve(n-1,m-i,i+1);
	    }
	    return ans;
	}
	}

