import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
		int m = sc.nextInt();
        int L = 1;
        int R = n;
        for(int i=0;i<m;i++){int l = sc.nextInt();
                             int r = sc.nextInt();
                             L=Math.max(L,l);
                             R=Math.min(R,r);
                            }
	    System.out.println(Math.max(R-L+1,0));
  }
}
