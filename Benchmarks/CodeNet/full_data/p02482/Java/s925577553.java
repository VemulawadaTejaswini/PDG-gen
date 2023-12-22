import java.util.Scanner;
public class Main {

	int n;
	int m;
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		if(n > m){
			System.out.println("a > b");
		}
		else if(n < m){
			System.out.println("a < b");
		}
		else{
			System.out.println("a == b");
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
        obj.doIt();

	}

}