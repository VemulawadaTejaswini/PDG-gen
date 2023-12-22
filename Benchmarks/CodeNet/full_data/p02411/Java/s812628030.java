import java.util.Scanner;
class Main {
	private static String[] ten = new String[100];
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int m = sc.nextInt();
		int f = sc.nextInt();
		int r = sc.nextInt();
		while(m != -1 || f != -1 || r != -1){
			if(m <= 50 && f <= 50){
				if(m == -1 || f == -1){
					ten[x] = "F";
				}else if(m + f >= 80){
					ten[x] = "A";
				}else if(m + f >= 65){
					ten[x] = "B";
				}else if(m + f >= 50 || (m + f >= 30 && r >= 50)){
					ten[x] = "C";
				}else if(m + f >= 30){
					ten[x] = "D";
				}else if(m + f < 30){
					ten[x] = "F";
				}
			}
			x++;
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
		}
		for(int i = 0; i <= x-1; i++){
			System.out.println(ten[i]);
		}
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}