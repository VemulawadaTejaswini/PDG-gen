import java.util.Scanner;
public class ColorfulTransceivers {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		int d=stdIn.nextInt();
		if(Math.abs(a-c)<=d||(Math.abs(b-c)<=d&&Math.abs(a-b)<=d)){
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		}

	}

