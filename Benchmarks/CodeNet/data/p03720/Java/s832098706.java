import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[]a = new int[m];
    int[]b = new int[m];
    int[]ans= new int[n];

    for(int i=0; i<m; i++){
        a[i] = sc.nextInt();
        	ans[a[i]-1]++;
        b[i] = sc.nextInt();
        	ans[b[i]-1]++;
}

   for(int i=0; i<n; i++){
		System.out.println(ans[i]);
    	}
}
}
