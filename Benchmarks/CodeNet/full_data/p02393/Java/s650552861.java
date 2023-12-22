import java.util.Scanner;
class Main {
    public void kami() {
        		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c){
			int work = c;
			c = a;
			a = work;
			
			if(a > b){
				work = a;
				a = b;
				b = work;
			}
		}else if(b > a && b > c){
			int work = c;
			c = b;
			b = work;
			
			if(a > b){
				work = b;
				b = a;
				a = work;
			}
		}else if(c > a && c > b){
			if(a > b){
				int work = b;
				b = a;
				a = work;
			}
		}
		System.out.println(a + " " + b + " " + c);
    }
	public static void main(String[] args) {
        new Main().kami();
	}

}