import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		
		Scanner sn = new Scanner(System.in);
		int tempX = sn.nextInt();
		int tempY = sn.nextInt();
		int tempZ = sn.nextInt();
		sn.close();
		
		if(tempY + 2 * tempZ <= tempX){
			if(1 <= tempX && tempX <= Math.pow(10, 8)){
				x = tempX;
			}
			if(1 <= tempY && tempY <= Math.pow(10, 8)){
				y = tempY;
			}
			if(1 <= tempZ && tempZ <= Math.pow(10, 8)){
				z = tempZ;
			}
		}
		try{
			int number = (x - z) / (y + z);
			System.out.println(number);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}