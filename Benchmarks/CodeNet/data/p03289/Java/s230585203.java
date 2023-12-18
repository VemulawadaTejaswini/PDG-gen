import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int nagasa = s.length();
		
		int WhereA = s.indexOf("A");
		int WhereC = s.indexOf("C");
		int LastC =s.lastIndexOf("C");
		int last = nagasa - 1;
		
		if (whereC =! LastC){
			System.out.println("WA");
			System.exit(0);
		}
		
		if (WhereC < 2){
			System.out.println("WA");
			System.exit(0);
		}
		
		if (WhereC == last){
			System.out.println("WA");
			System.exit(0);
		}
		int c_mae = WhereC - 1;
		int nimozime = 0;
		String mannaka = s.substring(1,c_mae);
		
		int c_ushiro = WhereC + 1;
		
		String ushiro = s.substring(c_ushiro,last);
		
		String naka_komozi = mannaka.toLowerCase();
		String ushiro_komozi = ushiro.toLowerCase();
		
		if (WhereA == 0 && WhereC > 1 && WhereC < nagasa && mannaka.equals(naka_komozi) && ushiro.equals(ushiro_komozi)) {
			System.out.println("AC");
		}else{
			System.out.println("WA");
		}
	
	
	}
}

