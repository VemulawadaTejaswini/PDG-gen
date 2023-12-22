import java.util.Scanner;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] T = new int[n];
	for(int i = 0;i < n;i++){
	    T[i] = sc.nextInt();
	}
	int r = sc.nextInt();
	for(int i = 0;i < r;i++){
	    int v = sc.nextInt();
	    boolean flag = solve(T,0,v);
	    System.out.println(flag ? "yes":"no");
	}
    }

    public static boolean solve(int[] T,int k,int m){
	if(m == 0){
	    return true;
	}
	if(m < 0 || k >= T.length){
	    return false;
	}
	return solve(T,k+1,m) || solve(T,k+1,m-T[k]);
        
    }
}

