import java.util.Scanner;
public class Main{
	public static int sumInteger(int min,int sum,int depth){
		int count = 0;
		if(sum == 0 && depth == 0){
			return 1;
		}else if(depth < 0 || sum < 0){
			return 0;
		}
		while(min < sum){
			count += sumInteger(min+1,sum-min-1,depth-1);
			min += 1;
		}
		return count;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a == 0 && b == 0){
				break;
			}
			int count = 0;
			for(int i = 0;i <= b;i++){
				count += sumInteger(i,b,a-1);
			}
			System.out.println(count);
		}
	}
}