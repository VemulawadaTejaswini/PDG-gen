import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc2 = new Scanner(System.in);
		
		while(true){
			String[] s = sc2.nextLine().split("[\\s]+");
			int y = Integer.parseInt(s[0]);
			int x = Integer.parseInt(s[1]);
			
			if((x|y) != 0){
				for(int i=0;i<y;i++){
					for(int i2=0;i2<x;i2++){
						if(i%2==0 && i2%2==0)System.out.print("#");
						else if(i%2!=0 && i2%2!=0)System.out.print("#");
						else{System.out.print(".");}
					}
					System.out.println();
				}
				System.out.println();
			}else{break;}
		}
	}
}