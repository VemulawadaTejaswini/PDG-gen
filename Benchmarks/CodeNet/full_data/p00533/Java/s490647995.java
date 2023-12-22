import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		String c[] = new String[height];
		for(int i = 0; i < height;i++){
			c[i] = sc.next();
		}
		int crowd[][] = new int[width][height];
		for(int i = 0;i <height;i++){
			for(int j = 0;j < width;j++){
				if(c[i].charAt(j) == 'c'){
					crowd[j][i] = 0;
				}else{
					crowd[j][i] = -1;	
				}
			}
		}
		for(int i = 0;i <height;i++){
			for(int j = 0;j < width;j++){
				for(int k = width-1;k >= 0;k--){
					if(crowd[k][i] == 0 && crowd[j][i] == -1 && k < j){
						crowd[j][i] = j-k;
					}
				}
			}
		}
		for(int i = 0;i <height;i++){
			for(int j = 0;j < width;j++){
				if(j < width-1){
					System.out.print(crowd[j][i]+" ");					
				}else{
					System.out.print(crowd[j][i]);						
				}
			}
			System.out.println();
		}
		
	}

}