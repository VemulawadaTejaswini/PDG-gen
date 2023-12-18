import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int[] nums = new int[n];
		int i;
		for(i=0; i<n; i++)
			nums[i] = Integer.parseInt(line[i]);
		
		int[] baseNums = new int[]{-1, -1, -1};
		int[] count = new int[3];
		for(Integer num : nums){
			for(i=0; i<3; i++){
				if( baseNums[i] == num ){
					count[i]++;
					break;
				}else if( baseNums[i] == -1 ){
					baseNums[i] = num;
					count[i] = 1;
					break;
				}
			}
			if( i == 3 ){
				System.out.println("No");
				System.exit(0);
			}
		}

		//面倒な0は最初に持ってくる
		if( baseNums[1] == 0 ){
			int tmp = baseNums[0];
			baseNums[0] = baseNums[1];
			baseNums[1] = tmp;
			tmp = count[0];
			count[0] = count[1];
			count[1] = tmp;
		}

		//数字3つが同じ数ある
		if( count[0] == count[1] && count[1] == count[2] )
			System.out.println("Yes");
		
		//数字2つ。そのうち1つは0。同じ数。
		else if( count[0] == count[1] && count[2] == 0 && baseNums[0] == 0 )
			System.out.println("Yes");
		
		//0のみ
		else if( baseNums[0] == 0 && count[0] == n )
			System.out.println("Yes");
		
		//数字2つ。そのうち1つは0。0の方が1だけ少ない。
		else if( count[1] != 0 && count[2] == 0 && baseNums[0] == 0 && count[0]+1 == count[1] )
			System.out.println("Yes");
		
		//数字2つ。そのうち1つは0。1:2の割合で0が少ない。
		else if( count[0] * 2 == count[1] && count[2] == 0 && baseNums[0] == 0 )
			System.out.println("Yes");
		
		//不適合
		else
			System.out.println("No");
	}
}
