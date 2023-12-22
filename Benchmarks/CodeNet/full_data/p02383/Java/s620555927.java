import java.util.Scanner;

public class Main {

	private static int[] face = new int[6];

	public static void action(char action){
		int intTemp;
		switch(action){
		case 'W':
			intTemp = face[0];
			face[0] = face[2];
			face[2] = face[5];
			face[5] = face[3];
			face[3] = intTemp;
			break;
		case 'E':
			intTemp = face[0];
			face[0] = face[3];
			face[3] = face[5];
			face[5] = face[2];
			face[2] = intTemp;
			break;
		case 'N':
			intTemp = face[0];
			face[0] = face[1];
			face[1] = face[5];
			face[5] = face[4];
			face[4] = intTemp;
			break;
		case 'S':
			intTemp = face[0];
			face[0] = face[4];
			face[4] = face[5];
			face[5] = face[1];
			face[1] = intTemp;
			break;
		default :
			break;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 6; i++){
			face[i] = scan.nextInt();
		}
		String strAction;
		char charAction;
		strAction = scan.next();
		for(int i = 0; i < strAction.length(); i++){
			charAction = strAction.charAt(i);
			action(charAction);
		}
		System.out.println(face[0]);
		scan.close();
	}
}