import java.util.Scanner;

public class Main{
	private static int N;
	
	private static void cal(){
		boolean flag = true;
		for(int h = 1;h<N&&flag;h++){
			for(int w = h;w<=3500&&flag;w++){
				long rs = 4*h*w - h*N - N*w;
				long  t = N*h*w;
				
				if( rs>0 && t%rs == 0){
					System.out.println(h+" "+w+" "+t/rs);
					flag = false;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()){
			N = in.nextInt();
			cal();
		}
	}
}
