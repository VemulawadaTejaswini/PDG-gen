import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			
			int num = y*10000 + m*100 + d;
			if(num<18680908){
				System.out.println("pre-meiji");
			}else if(num>=18680908 && num<19120730){
				System.out.println("meiji " + (y-1867) + " " + m + " " + d);
			}else if(num>=19120730 && num<19261225){
				System.out.println("taisho " + (y-1911) + " " + m + " " + d);
			}else if(num>=19261225 && num<19890108){
				System.out.println("showa " + (y-1925) + " " + m + " " + d);
			}else{
				System.out.println("heisei " + (y-1988) + " " + m + " " + d);
			}
		}
	
	}	
}