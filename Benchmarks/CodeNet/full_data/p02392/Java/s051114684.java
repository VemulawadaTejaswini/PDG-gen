import java.util.Scanner;
class Range {
	int a,b,c;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a < b){
			if(b < c){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}
	}
	public static void main(String[] args){
		new Range().suzuki();
	}
}