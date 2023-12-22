import java.util.Scanner;
class Main{
	public void Germany() {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
			int[] ai = new int[x];
			while(ai[x] < 1000000){
				if(ai[x] < ai[x+1]){
				System.out.println(ai[x]);
				}else{
					ai[x]++;
				}
			}
		}
	public void Japan() {
		int y;
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
			int[] aj = new int[y];
			while(aj[y] < 1000000){
				if(aj[y] > aj[y+1]){
					System.out.println(aj[y]);
				}else{
					aj[y]++;
				}
			}
		}
	public void China() {
		int z;
			Scanner sc = new Scanner(System.in);
		z = sc.nextInt();
			int[] ak = new int[z];
			while(ak[z] < 1000000){
				if(ak[z] < ak[z+1]){
				System.out.println(ak[z] + ak[z+1]);
				}else{
					ak[z]++;
				}
			}
		}
	public static void main(String[] args) {
			new Main().Germany();
			new Main().Japan();
			new Main().China();
	}
}