import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long posFirst = Long.parseLong(sc.next());
		Long numStep = Long.parseLong(sc.next());
		Long lenStep = Long.parseLong(sc.next());
		long result = 0;

		posFirst = Math.abs(posFirst);

		while(posFirst >= 0){
			if(numStep == 0) break;

			posFirst -= lenStep;
			numStep--;
		}

		if(numStep % 2 == 1){
			posFirst = Math.abs(posFirst) - lenStep;
		}

		System.out.println(Math.abs(posFirst));
		// System.out.println(numStep);
	}
}
