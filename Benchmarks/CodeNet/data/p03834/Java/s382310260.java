import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a[] = sc.next().toCharArray();
		for(int i=0;i<19;i++){
			if(a[i]==','){
				a[i]=' ';
			}
		}
		for(int i=0;i<19;i++){
			System.out.print(a[i]);
		}
	}
}
