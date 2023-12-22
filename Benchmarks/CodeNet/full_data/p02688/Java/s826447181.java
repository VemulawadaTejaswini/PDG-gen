import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int y = 100;
		int[][] nums = new int[k][y];
		int d = 0;
		int cnt = 0;
      int check[] = new int[y];
      int num = 0;
      
		for(int i=0;i<k;i++) {
			d = sc.nextInt();
          
			for(int j=0;j<d;j++) {
				nums[i][j] = sc.nextInt();
				check[num] = nums[i][j];
              num++;
			}
		}
		
		
		Arrays.sort(check);
      int a = 0;
		for(int i=0;i<check.length;i++) {
			if(check[i]-a > 1) {
				cnt += check[i]-a-1;
                a += check[i]-a;
			}else if(check[i]-a == 0){
            }else if(check[i]-a == 1){
              a++;
            }
		}
 System.out.println(cnt);
		}
}