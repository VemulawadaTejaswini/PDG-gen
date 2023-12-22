import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int X[]=new int[6];
    	int ans=0;
    	for(int i=1;i<=5;i++){
    		X[i]=sc.nextInt();
    	}
    	for(int j=1;j<=5;j++){
    		if (X[j]==0) {
    			ans=j;
    		}
    	}
		System.out.println(ans);
		//System.out.print(ans);
		

    }
}