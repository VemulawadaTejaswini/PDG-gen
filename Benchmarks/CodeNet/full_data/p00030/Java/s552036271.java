import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int s = scan.nextInt();
			if(n == 0 && s == 0){
				break;
			}
			int count = 0;
			for(int i = 0;i <= 9;i++){
				if(i > s){
					break;
				}
				count += sumInteger(i,s-i,n-1);
			}
			System.out.println(count);
		}
	}
	public static int sumInteger(int min,int lest,int depth){
		int count = 0;
		if(lest == 0 && depth == 0){
			return 1;
		}else if(min > lest || depth < 0){
			return 0;
		}
		while(min <= lest){
			min+=1;
			count += sumInteger(min,lest-min,depth-1);
		}
		return count;
	}
}