import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nagasa = scan.nextInt();
		String moziretu = scan.next();
		int index = 0;
		int count = 0;

		while(true) {
			index = moziretu.indexOf("ABC",index)+1;
		if(index == 0) {
			break;
		}else
		{
			count++;
		}
		}

		System.out.println(count);
		scan.close();

	}

}
