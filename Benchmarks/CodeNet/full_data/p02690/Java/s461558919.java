import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p[] = new int[1000];
		Arrays.fill(p, 0);
		
		int x = sc.nextInt();
		int y = x;
		
		if(x == 1) {
			System.out.println("0 -1");
			return;
		}
		
		for (int i = 2; x > i; i++) {
            while ((y % i) == 0) {
				for(int j = 0; j <= i; j++) {
					if((int)(Math.pow(j, 5) - Math.pow(j - i, 5)) == x) {
						System.out.println(j+" "+(j-i));
						return;
					}
				}
				
                y = y / i;
            }
        }
		
	}
}