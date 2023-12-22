import java.util.Scanner;

public class Main {
	private int count;
	public Main(){
	}
	public void sumInteger(int min,int sum,int depth){
		if(sum == 0 && depth == 0){
			count += 1;
			return;
		}else if(depth < 0 || sum-min < 0 || min > sum){
			return;
		}
		while(min <= sum){
			sumInteger(min+1,sum-min-1,depth-1);
			min += 1;
		}
	}
	public void outPut(){
		System.out.println(count);
	}
	public void setCount(){
		count = 0;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Main p = new Main();
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a == 0 && b == 0){
				break;
			}
			p.setCount();
			for(int i = 0;i <= b;i++){
				p.sumInteger(i,b,a-1);
			}
			p.outPut();
		}
	}
}