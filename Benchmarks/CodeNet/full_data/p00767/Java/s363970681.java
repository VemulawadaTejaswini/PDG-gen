import java.util.Scanner;


public class Main {
	
	static final int MAX = 150;
	
	public Main() {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			if(h==0 && w==0) break;
			int size = h*h + w*w;
			int miny = Integer.MAX_VALUE;
			int minx = Integer.MAX_VALUE;
			int mins = Integer.MAX_VALUE;
			for(int y=1;y<=MAX; y++) {
				for(int x=y+1; x<=MAX; x++) {
					int s = y*y+x*x;
					if(s > size || (s == size && y > h)) {
						if(s < mins) {
							mins = s;
							miny = y;
							minx = x;
						} else if(mins == s) {
							if(y < miny) {
								miny = y;
								minx = x;
							}
						}
						
					}
				}
			}
			System.out.println(miny + " "+ minx);
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new Main();
	}
	

}