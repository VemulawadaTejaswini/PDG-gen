import java.util.Scanner;

public class Main {
public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		int K = scan.nextInt();
		int S = scan.nextInt();
		
		int count = 0;
		
		
		
		for(int x = 0;x<=K;x++){
			for(int y = 0;y<=K;y++){
				for(int z = 0;z<=K;z++){
					
					if(x+y+z == S)
						count +=1;
					
				}
			}
			
		}
		
		System.out.println(count);
		
		
		
	}


	

}
