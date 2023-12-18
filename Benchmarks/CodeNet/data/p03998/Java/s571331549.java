import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Aのカード");
		String a = scan.next();
		System.out.println("Bのカード");
		String b = scan.next();
		System.out.println("Cのカード");
		String c = scan.next();
		String[] sa = new String[a.length()];
		String[] sb = new String[b.length()];
		String[] sc = new String[c.length()];
		
		for(int i = 0 ;i < a.length(); i++) {
			sa[i] = a.substring(i, i+1);
		}
		for(int i = 0 ;i < b.length(); i++) {
			sb[i] = b;
		}
		for(int i = 0 ;i < c.length(); i++) {
			sc[i] = c;
		}
		String f;
		String result = "A";
		for(int i = 0; i < sa[i].length(); i++) {
			f = sa[i];
			if(f.equals("b")){
				for(int j = 0; j < sb[j].length(); j++) {
					if(f.equals("a") || f.equals("c")){
						return;
					}
					if(j == sb[j].length()-1){
						result = "B";
						break;
					}
				}
			}
			if(f.equals("c")) {
					for(int k = 0; k < sc[k].length(); k++) {
						if(f.equals("a") || f.equals("b")){
							return;
						}
						if(k == sc[k].length()-1){
							result = "C";
							break;
						}
					}
			}
			if(i == sa[i].length()-1){
				break;
			}
		}
		
		System.out.println(result);
	}
}

