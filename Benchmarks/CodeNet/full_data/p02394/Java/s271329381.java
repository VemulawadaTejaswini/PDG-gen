import java.util.Scanner;
 
class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if(x+r<=W && x-r=>0 && y+r<=H && y-r=>0){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}