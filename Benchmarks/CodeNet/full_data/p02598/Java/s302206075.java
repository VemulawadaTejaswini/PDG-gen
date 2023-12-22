import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
        int [] in = new int [n];		
        for(int i=0;i<n;i++){in[i] = sc.nextInt();
                            }
        Arrays.sort(in);
        int ans = in[n-1];
		System.out.println(ans);
	}
}
