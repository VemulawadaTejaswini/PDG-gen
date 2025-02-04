import java.util.Scanner;

public class Main {
	
	
	public static final int SIZE = 8;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++){
			String[] strs = sc.nextLine().split(":");
			int hour = Integer.parseInt(strs[0]);
			int min = Integer.parseInt(strs[1]);
			
			int m_rad = (int) ((min / 60.0) * 360);
			int h_rad = (int) ((hour / 12.0) * 360 + (min / 60.0) * 30);
			
			//System.out.println("m:" + m_rad + ", h:" + h_rad);
			
			int diff = Math.abs(m_rad - h_rad);
			
			if(0 <= diff && diff < 30){
				System.out.println("alert");
			}else if(90 <= diff && diff < 180){
				System.out.println("safe");
			}else{
				System.out.println("warning");
			}
			
		}
	}
	
}