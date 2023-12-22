import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	int[] a = new int[n];
	int ans = 0;
	for(int i=0;i<n;i++){
	    a[i] = sc.nextInt();
	}
	boolean flag = false;
	for(int i=0;i<n;i++){
	    flag = false;
	    for(int j=0;j<n;j++){
		if(i==j) continue;
		if(a[i]%a[j]==0){
		    flag = true;
		    break;
		}
	    }
	    if(!flag) ans++;
	}
	System.out.println(ans);
    }
}
