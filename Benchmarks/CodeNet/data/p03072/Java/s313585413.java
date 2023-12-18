import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Scanner sa = new Scanner(System.in);
		int building[] = new int[n]; 
		for(int i = 0;i < n ; i++){
			building[i] = sc.nextInt();
		}

		int ans =1;

		for(int j =1;j<n;j++){
			int counter=0;
			for(int k=0;k<j;k++){
				if(building[k] <= building[j]){
					counter++;
				}
			}
			if(counter == j){
				ans++;
			}
		}

		System.out.println(ans);

	}
}