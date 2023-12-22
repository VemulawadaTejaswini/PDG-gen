import java.util.Scanner;

public class CakeMain {
	private int x;
	private int y;
	private int[] card;
	private int sum;
	Scanner in =new Scanner(System.in);
	public CakeMain(){
		
		x=in.nextInt();
		if (x==0){
			return;
		}
		
	}
	public static void main(String[] args){
		
		CakeMain ck=new CakeMain();
		ck.com();
		ck.rd();
		ck.run();
		
	}

	private void run() {
		
		for(int i=0;i<y;i++){
			sum+=card[i];
		}
		System.out.println(sum/2);
	}
	private void com() {
		
		y=x*(x-1)/2;
	}
	private void rd() {
		
		card=new int[y];
		for(int i=0;i<y;i++){
			card[i]=in.nextInt();
		}
		
		
		
	}
}