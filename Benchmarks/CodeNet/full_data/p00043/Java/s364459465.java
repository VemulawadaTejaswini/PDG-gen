import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		while(scan.hasNextLong()){
			long l = scan.nextLong();
			for(int i = 0;i < num.length;i++){
				num[i] = 0;
			}
			for(int i = 0;i < 13;i++){
				num[(int)(l % 10)]++;
				l /= 10;
			}
			boolean hasAns = false;
			for(int i = 1;i <= 9;i++){
				num[i]++;
				if(num[i] <= 4 && dfs(num,1,false)){
					if(hasAns){
						System.out.print(" ");
					}
					System.out.print(String.valueOf(i));
					hasAns = true;
				}
				num[i]--;
			}
			if(!hasAns){
				System.out.print("0");
			}
			System.out.println("");
		}
	}
	static boolean dfs(int[] num,int i,boolean head){
		boolean res = true;
		for(int j = 0;j <= 9;j++){
			if(num[j] != 0){
				res = false;
			}
		}
		if(res){
			return true;
		}
		for(int j = i;j <= 9;j++){
			if(!head && num[j] >= 2){
				num[j] -= 2;
				res |= dfs(num,j,true);
				num[j] += 2;
			}
			if(num[j] >= 3){
				num[j] -= 3;
				res |= dfs(num,j,head);
				num[j] += 3;
			}
			if(j < 8 && num[j] > 0 && num[j + 1] > 0 && num[j + 2] > 0){
				num[j]--; num[j + 1]--; num[j + 2]--;
				res |= dfs(num,j,head);
				num[j]++; num[j + 1]++; num[j + 2]++;
			}
		}
		return res;
	}
}