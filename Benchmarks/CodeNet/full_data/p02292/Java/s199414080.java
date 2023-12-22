import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double px, py, x1, y1, x2, y2, angle1, angle2, back, rad, leng1, leng2;
		
		int q;
		
		px = scan.nextDouble();
		py = scan.nextDouble();
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();

		rad = Math.atan2(y1 - py, x1 - px);
		
		angle1 = rad * 180 / Math.PI;
		
		if(angle1 < 0) angle1 += 360;
		
		back = angle1 + 180;
		
		leng1 = Math.sqrt((x1 - px) * (x1 - px) + (y1 - py) * (y1 - py));

		if(back >= 360) back -= 360;
		
		q = scan.nextInt();
		
		for(int i = 0; i < q; i++) {
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();

			rad = Math.atan2(y2 - py, x2 - px);
			angle2 = rad * 180 / Math.PI;
			
			if(angle2 < 0) angle2 += 360;
			
			if(px == x2 && py == y2) {
				System.out.println("ON_SEGMENT");
				
			} else if(angle2 == angle1) {
				leng2 = Math.sqrt((x2 - px) * (x2 - px) + (y2 - py) * (y2 - py));
				
				if((leng2 - leng1) <= 0) {
					System.out.println("ON_SEGMENT");
					
				} else {
					System.out.println("ONLINE_FRONT");
					
				}				
			} else if(angle2 == back) {
				System.out.println("ONLINE_BACK");
				
			} else if (back < 180) {
				if(angle2 > back && angle2 < angle1) {
					System.out.println("CLOCKWISE");
					
				} else {
					System.out.println("COUNTER_CLOCKWISE");
				}
				
			} else {
				if(angle2 < back && angle2 > angle1) {
					System.out.println("COUNTER_CLOCKWISE");
					
				} else {
					System.out.println("CLOCKWISE");
				}				
			}
		}
		scan.close();
	}

}