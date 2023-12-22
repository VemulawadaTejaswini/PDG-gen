import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		int ans = 0;
		int n = scan.nextInt();
		int[] list = new int[n];

		for(int i = 0; i < n; i++){
			int a = scan.nextInt();
			list[i] = a;
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j) continue;
				//if(list[i] < list[j]) break;
			
	
				if(list[i] % list[j] == 0){
					ans++;
					break;

				}
				
			}
		}

		
                System.out.println(n-ans);
    }
}
