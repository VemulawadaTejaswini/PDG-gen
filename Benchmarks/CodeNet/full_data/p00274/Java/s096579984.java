import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int N = sc.nextInt();
			if(N == 0)break;
			int x = 0;
			int y = 0;
			boolean ab = true;
			for(int i = 0; i < N; i++){
				x = sc.nextInt();
				if(x > 0)y++;
				if(x <= 1)ab = false;
			}
			if(ab)System.out.println(y+1);
			else System.out.println("NA");
		}
	}
}