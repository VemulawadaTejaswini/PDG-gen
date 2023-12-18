import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int sl = s.length();
		int tl = t.length();
		boolean b = false;
		if(sl == tl){
			System.out.println(t);
			sc.close();
			return;
		}else{
			for(int i = 0; i <= sl - tl && !b;i++){
				String subS = s.substring(i, i+tl);
				b = contains(subS, t, tl);
				if(b){
					s = s.replace(subS, t);
					s = s.replaceAll("\\?", "a");
					break;
				}
			}
			if(b){
				System.out.println(s);
			}else{
				System.out.println("UNRESTORABLE");
			}
		}

		sc.close();
	}

	private static boolean contains(String subS, String t, int tl){
		boolean b = true;
		for(int l = 0; l < tl && b; l++){
			b &= subS.charAt(l) =='?' || subS.charAt(l) == t.charAt(l);
		}

		return b;
	}
}
