import java.util.Scanner;
class Main {
	int a,b,c,x,y,i;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		for(y = a;y <= b;y++){
			x = c % y;
			if(x == 0){
				i++;
			}
		}
		System.out.println(i);
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}