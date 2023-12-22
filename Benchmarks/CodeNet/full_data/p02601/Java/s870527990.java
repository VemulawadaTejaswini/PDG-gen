import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int red = sc.nextInt();
		int green = sc.nextInt();
		int blue = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		boolean condGR = (green > red);
		boolean condBG = (blue > green);

		if(!condGR){
			if(green == red){
				k--;
				condGR = true;
			}else{
				int greenRedDiff = (red - green)/2;
				if(greenRedDiff <= k){
					green *= greenRedDiff * 2;
					k -= greenRedDiff;
					condGR = true;
				}
			}
		}
		if(!condBG && k > 0){
			if(blue == green){
				condBG = true;
			}else{
				int blueGreenDiff = (green - blue)/2;			
				if(blueGreenDiff <= k){
					condBG = true;
				}
			}
		}	
		
		

		if(condBG && condGR){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}
