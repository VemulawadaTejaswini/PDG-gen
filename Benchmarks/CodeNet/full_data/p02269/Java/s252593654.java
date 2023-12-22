import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t=scan.nextInt();
		Set<String> set=new HashSet<String>();
		while((t--)!=0){
			String s=scan.next();
			String ch=scan.next();
			if(s.equals("insert")){
				set.add(ch);
			}else{
				if(set.contains(ch))
					System.out.println("yes");
				else
					System.out.println("no");
			}
			
			
			
		}
	}


}