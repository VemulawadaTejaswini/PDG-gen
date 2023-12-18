import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int cnt = 0;
		Scanner scanner = new Scanner(System.in);
		int  strLen = scanner.nextInt();
		String str = scanner.nextLine();
		String[] splitStr = str.split("",0);
		for(int i = 0; i <= strLen; i++){
			if(splitStr[i].equals("I")){
				cnt++;
			}else if(splitStr[i].equals("D")){
				cnt--;
			}
			System.out.println(cnt);
		}
		System.out.println(cnt);
		scanner.close();
	}
}