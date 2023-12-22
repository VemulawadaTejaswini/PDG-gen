import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		List<Integer> listN = new ArrayList<Integer>();
		List<Integer> listX = new ArrayList<Integer>();
		for(;;){
			int n = scan.nextInt();
			int x = scan.nextInt();
			if((n == 0) && (x == 0)){
				break;
			}
			listN.add(n);
			listX.add(x);
		}

		for(int i = 0; i < listN.size(); i++){
			int n = listN.get(i);
			int x = listX.get(i);
			int cnt = 0;
			for(int j = 1; j <= n; j++){
				for(int a = 1; a < n; a++){
					for(int d = 1; d < n; d++){
						for(int e = 1; e < n; e++){
							int sum = 3a + 2d + e;
							if(sum == x){
								cnt++;
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}