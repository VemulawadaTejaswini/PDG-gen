import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
		int[] height;		
		height = new int[n];		//身長
		for (int i=0; i<n; i++){
			height[i] =  scan.nextInt();
		}
		int count = 0;

		for (int i=0; i<n-1; i++){
		for (int j=i+1; j<n; j++){
			if(Math.abs(i-j)==(height[i]+height[j])){ count++;}
		}}
		
		System.out.println(count);
	    scan.close();	
    }
}