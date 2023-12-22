import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() { 
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			String str[] = new String[n];
			int a[] = new int [n];
			int b[] = new int [n];
			int max = 0;
			for(int i = 0;i < n;i++){
				str[i] = sc.next();
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				max = max + a[i];
			}
			for(int i = 0;i < n;i++){
				int k = 0;
				int l = 0;
				for(int j = 0;j < n;j++){
					if(max - a[j] <= b[j]){
						if(a[j] > k){
							k = a[j];
							l = j;
						}	
					}
				}
				max = max - a[l];
				a[l] = 0;
				b[l] = -10;
				System.out.println(str[l]);
			}
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}