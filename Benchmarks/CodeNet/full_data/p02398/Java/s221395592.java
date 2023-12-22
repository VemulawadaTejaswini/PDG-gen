import java.util.Scanner;
class Main{
	int a,b,c;
	int x,y,i;
	public void Germany() {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		for(i = a;i <= b;i++) {
			x = c % i;
			if(x == 0){
				y++;
			}
		}
		System.out.println(y);
	}
	    public static void main(String[] args) {
	        new Main().Germany();
	    }
	}