import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int w = 100;
		int h = 100;
		
		System.out.println(h+" "+ w);
		
		int x = 0;
		int y = 0;
		
		int mode = 0;

		for(int i =0 ; i< h ; i ++){	
			for(int j =0 ; j < w; j++){
				
				if(mode ==0 ){
					
					
					if(i %2 ==0  && j %2 ==0 && x < a -1){
						System.out.print(".");
						x++;
					}else{
						System.out.print("#");
					}
					
					
					
				}else{
					
					if(i %2 ==0 && j %2 == 0 && y < b-1){
						System.out.print("#");
						y++;
					}else{
						System.out.print(".");
					}
					
				}
			}
			System.out.println();
			if(mode==0 && x == a-1){
				mode = 1;
				
				for(int j = 0; j < w; j++){
					System.out.print("#");					
				}
				System.out.println();
				i++;
				for(int j = 0; j < w; j++){
					System.out.print(".");					
				}
				System.out.println();
				i++;
			}
		}
		
	}
}
