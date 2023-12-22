import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc2 = new Scanner(System.in);
		
		while(true){
			String[] s = sc2.nextLine().split("[\\s]+");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			
			if(x != 0 && y != 0){
				for(int i=0;i<y;i++){
					for(int i2=0;i2<x;i2++){
						System.out.print("#");
					}
					System.out.println();
				}
			}
		}
	}
}