import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), x = sc.nextInt();
		int c=0;
		
		while(n!=0 || x!=0){
			c=0;
			for(int i=1; i<n-1;i++){
				for(int j=i+1; j<n; j++){
					for(int k=j+1; k<n+1;k++){
						if(i+j+k==x){
							c+=1;
						}
					}
				}
			}
				System.out.println(c);
				n = sc.nextInt();
				x = sc.nextInt();
		}

	}

}