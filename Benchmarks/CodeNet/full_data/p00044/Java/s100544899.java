import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] pri = new int[55000];
		for(int i=2;i<=51000;i++){
			pri[i] = i;
		}

		for(int i=2;i<=51000;i++){
			for(int j=i+i;j<=51000;j+=i){
					pri[j]=0;
			}
		}
		
		while(sc.hasNext()){
			int n = sc.nextInt();

			for(int i=n-1;;i--){
				if(pri[i]>0){
					System.out.print(pri[i]);
					break;
				}
			}
			for(int i=n+1;;i++){
				if(pri[i]>0){
					System.out.println(" " + pri[i]);
					break;
				}
			}
			
		}
	}
}