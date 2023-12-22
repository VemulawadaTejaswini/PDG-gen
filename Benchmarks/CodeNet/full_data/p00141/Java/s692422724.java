import java.util.Scanner;

public class Main {
	
	public static char[][] array = new char[104][104];
	public static final int UP_MODE = 0;
	public static final int DOWN_MODE = 1;
	public static final int LEFT_MODE = 2;
	public static final int RIGHT_MODE = 3;
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean first = false;
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int num = sc.nextInt();
			
			if(first == true){
				System.out.println();
			}
			
			for(int j = 0; j < (num+4); j++){
				for(int k = 0; k < (num+4); k++){
					if(j < 1 || j > (num + 2) || k < 1 || k > (num + 2)){
						array[j][k] = '#';
					}else{
						array[j][k] = ' ';
					}
				}
			}
			
			int n_x = 2,n_y = num + 1;
			boolean n_end = true;
			boolean changed = false;
			int state = UP_MODE;
			while(n_end){
				/*
				for (int j = 2; j < (num + 2); j++) {
					for (int k = 2; k < (num + 2); k++) {
						System.out.print(array[j][k]);
					}
					System.out.println();
				}
				System.out.println();
				*/
				if(array[n_y][n_x] == ' '){
					array[n_y][n_x] = '#';
				}
				
				switch(state){
				case UP_MODE:
					if(array[n_y-2][n_x] == ' '){
						n_y--;
						changed = false;
					}else if(changed == false){
						if(array[n_y-1][n_x+1] == ' ' && array[n_y+1][n_x+1] == ' '){
							state = RIGHT_MODE;
							changed = true;
						}else{
							n_end = false;
						}
					}else{
						n_end = false;
					}
					
					break;
				case DOWN_MODE:
					if(array[n_y+2][n_x] == ' '){
						n_y++;
						changed = false;
					}else if(changed == false){
						if(array[n_y-1][n_x-1] == ' ' && array[n_y+1][n_x-1] == ' '){
							state = LEFT_MODE;	
							changed = true;
						}else{
							n_end = false;
						}
					}else{
						n_end = false;
					}
					
					break;
				case LEFT_MODE:
					if(array[n_y][n_x-2] == ' '){
						n_x--;
						changed = false;
					}else if(changed == false){
						if(array[n_y-1][n_x-1] == ' ' && array[n_y-1][n_x+1] == ' '){
							state = UP_MODE;
							changed = true;
						}else{
							n_end = false;
						}
					}else{
						n_end = false;
					}
					
					break;	
				case RIGHT_MODE:
					if(array[n_y][n_x+2] == ' '){
						n_x++;
						changed = false;
					}else if(changed == false){
						if(array[n_y+1][n_x-1] == ' ' && array[n_y+1][n_x+1] == ' '){
							state = DOWN_MODE;
							changed = true;
						}else{
							n_end = false;
						}
					}else{
						n_end = false;
					}
					
					break;
				}
			}
			
			
			for (int j = 2; j < (num + 2); j++) {
				for (int k = 2; k < (num + 2); k++) {
					System.out.print(array[j][k]);
				}
				System.out.println();
			}
			
			if(first == false){
				first = true;
			}
		}
		
	}
	
}