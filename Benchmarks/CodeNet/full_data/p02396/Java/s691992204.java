import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i=1;
		while(sc.hasNext()) {
		int a = sc.nextInt();
		if(a==0) 	break;
				
			System.out.printf("case %d:%d\n",i,a);
			i++;
		}
	}
}

