import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		//task d multiple (hard) -- failed
		Scanner sc= new Scanner(System.in);
		String S = sc.nextLine();
		int count = 0;
		HashSet<Long> vals = new HashSet<>(); vals.add(0L);
		for(int i = S.length()-1; i>=0; i--){
			String sp = S.substring(i);
			long potential = Long.parseLong(sp)%2019;
			if(!vals.contains(potential)){
				vals.add(potential);
			}else{
				count++;
			}
		}
		System.out.println(count);

	}
}
