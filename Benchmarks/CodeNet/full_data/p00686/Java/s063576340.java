import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(h == 0 && w == 0){
				break;
			}
			
			int cur_x = 1;
			int cur_y = 1;
			int move = 0;
			
			while(true){
				String str = sc.next();
				
				if("STOP".equals(str)){
					break;
				}else if("FORWARD".equals(str)){
					int m = sc.nextInt();
					
					switch(move){
					case 0:
						cur_y = cur_y + m > h ? cur_y : cur_y + m;
						break;
					case 1:
						cur_x = cur_x + m > w ? cur_x : cur_x + m;
						break;
					case 2:
						cur_y = cur_y - m < 1 ? cur_y : cur_y - m;
						break;
					case 3:
						cur_x = cur_x - m < 1 ? cur_x : cur_x - m;
						break;
					}
				}else if("BACKWARD".equals(str)){
					int m = sc.nextInt();
					
					switch(move){
					case 0:
						cur_y = cur_y - m < 1 ? cur_y : cur_y - m; 
						break;
					case 1:
						cur_x = cur_x - m < 1 ? cur_x : cur_x - m;
						break;
					case 2:
						cur_y = cur_y + m > h ? cur_y : cur_y + m;
						break;
					case 3:
						cur_x = cur_x + m > w ? cur_x : cur_x + m;
						break;
					}
				}else if("RIGHT".equals(str)){
					move = move >= 4 ? 0 : move + 1;
				}else if("LEFT".equals(str)){
					move = move <= 0 ? 3 : move - 1;
				}
			}
			
			System.out.println(cur_x + " " + cur_y);
		}
		
	}

}