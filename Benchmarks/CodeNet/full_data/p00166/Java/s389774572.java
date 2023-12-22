import java.util.Scanner;


public class Main {
	
	public static final double EPS = 1e-06;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int v1 = sc.nextInt();
			
			if(v1 == 0){
				break;
			}
			
			int[] degs1 = new int[v1];
			int sum1 = 0;
			for(int i = 0; i < v1 - 1; i++){
				final int d = sc.nextInt();
				sum1 += d;
				degs1[i] = d;
			}
			degs1[v1 - 1] = 360 - sum1;
			
			final int v2 = sc.nextInt();
						
			int[] degs2 = new int[v2];
			int sum2 = 0;
			for(int i = 0; i < v2 - 1; i++){
				final int d = sc.nextInt();
				sum2 += d;
				degs2[i] = d;
			}
			degs2[v2 - 1] = 360 - sum2;
			
			double menseki1 = 0;
			for(int i = 0; i < v1; i++){
				menseki1 += (Math.sin((degs1[i] / 360.0) * Math.PI) * (Math.cos((degs1[i] / 360.0) * Math.PI)));
			}
			
			double menseki2 = 0;
			for(int i = 0; i < v2; i++){
				menseki2 += (Math.sin((degs2[i] / 360.0) * Math.PI) * (Math.cos((degs2[i] / 360.0) * Math.PI)));
			}
			
			if(Math.abs(menseki1 - menseki2) < EPS){
				System.out.println("0");
			}else if(menseki1 > menseki2){
				System.out.println("1");
			}else{
				System.out.println("2");
			}
		}
		
	}

}