import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
		int[] height;		
		height = new int[n];		//標高
		for (int i=0; i<n; i++){
			height[i] =  scan.nextInt();
		}

		int[][] roots;		
		roots = new int[m][2];		//標高
		for (int i=0; i<m; i++){
			roots[i][0] = scan.nextInt();
			roots[i][1] = scan.nextInt();
		}		

		int count = 0;
		int standard = 0;
		int standard_height = 0;
		for (int i=0; i<n; i++){
			standard = 0;
			standard_height = height[i];

		for (int j=0; j<m; j++){		
			if(roots[j][0]==i) {
				if(standard_height<height[(roots[j][1])-1]){
					standard++;
				}				
			}
			if(roots[j][1]==i) {
				if(standard_height<height[(roots[j][0])-1]){
					standard++;
				}				
			}
		}
			if(standard==0) {count++;}
		}
		
		
		System.out.println(count);
	    scan.close();	
    }
}