import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int out = 0;
		int b = size;
		for(int i = 0;i < size;i++){
			int num = sc.nextInt();
			out = hantei(num,b);
			b = num;
		}
		System.out.println(3);
	}
	
	
	private static int hantei(int x,int y){
		int n = 0;
		if(x < y){
			n = y - x;
		}else if(y < x){
			n = y - x;
			//n = - ni;
		}else if(x == y){
			n = 0;
		}
		return n;
	}
	
}