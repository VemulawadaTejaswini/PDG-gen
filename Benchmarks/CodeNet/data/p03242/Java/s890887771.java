import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		String nArr[] = n.split("",0);
		
		for (int i = 0; i < 3; i++) {
			if (nArr[i].equals("1")) {
				nArr[i] = "9";
			} else {
				nArr[i] = "1";
			}
		}
		
		System.out.println(nArr[0] + nArr[1] + nArr[2]);
	}
}