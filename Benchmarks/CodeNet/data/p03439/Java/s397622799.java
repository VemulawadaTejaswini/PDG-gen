import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String tar[] = {"Vacant", "Male", "Female"};
		int q = 0, i = 0;
		while(true) {
		System.out.println(q);
		String s = sc.next();
		if(s.equals(tar[0]))break;
		if(i <= 3)
		++i;
		else --i;
		if(i == 3)i = (n - 1) / 2;
		if(i % 2 == 0)
		q = n - (i / 2);
		else q = i;
		}
		sc.close();
	}

}
