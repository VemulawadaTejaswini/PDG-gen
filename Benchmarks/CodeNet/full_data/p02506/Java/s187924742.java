import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String key=sc.nextLine();
		int i=0;
		while(sc.hasNext()){
			if(key.equalsIgnoreCase(sc.next()))i++;
		}
		System.out.println(i);
	}

}