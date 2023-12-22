import java.util.Scanner;
class Main {
	int x,i = 1;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		while(x != 0){
			System.out.println("Case" + " " + i + ":" + " " + x);
			x = sc.nextInt();
			i++;
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}