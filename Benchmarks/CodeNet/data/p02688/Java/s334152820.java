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
      List<Integer> list = new ArrayList<>();
      int num = 0;
      
		for(int i=0;i<k;i++) {
			d = sc.nextInt();
          
			for(int j=0;j<d;j++) {
				nums[i][j] = sc.nextInt();
				list.add(nums[i][j]);
              num++;
			}
		}
		
		Integer[] check = list.toArray(new Integer[list.size()]);
		Arrays.sort(check);
      int a = 1;
		for(int i=0;i<check.length;i++) {
			if(check[i]-a==1) {
				cnt++;
			}else if(check[i]-a>1){
				cnt++;
				i--;
			}
          a++;
		}
 System.out.println(cnt);
		}
}