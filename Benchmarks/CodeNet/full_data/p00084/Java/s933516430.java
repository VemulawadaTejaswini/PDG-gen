import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split("[,\\.\\s]+");
		for(int i = 0; i < tmp.length; i++){
			if(tmp[i].length()<=2 || tmp[i].length()>=7)continue;
			else System.out.print(tmp[i] + " ");
		}

	}
}