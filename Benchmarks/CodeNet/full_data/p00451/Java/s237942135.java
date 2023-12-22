import java.util.Scanner;

//Common Sub-String
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			String t = sc.next();
			int i = 0;
			int j = 1;
			int m = 0;
			while(j<=s.length()){
				String sub = s.substring(i,j);
				if(t.contains(sub)){
					m = Math.max(m, sub.length());
					j++;
				}
				else i++;
			}
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}