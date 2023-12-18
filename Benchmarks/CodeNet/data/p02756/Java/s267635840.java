import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder(s);
		boolean r = false;
		while(n-- > 0){
			int format = sc.nextInt();
			if(format == 1 && r == false){
				r = true;
			}
			else if (format == 1 && r == true){
				r = false;
			}
			else{
				int pos = sc.nextInt();
				StringBuilder add = new StringBuilder(sc.next());
				if(pos == 1 && r == false || pos == 2 && r == true){
					sb = sb.insert(0, add);
				//	sb = add + sb;
				}
				else{
					sb = sb.insert(sb.length(), add);
					//s = s + add;
				}
			}
		}
		if (r == true){
			/*for(int i = s.length()-1 ; i>=0 ; i--){
				System.out.print(s.charAt(i));
			}*/
			sb = sb.reverse();
			System.out.println(sb);
		}
		else{
			System.out.println(sb);
		}
		
	}
	/*public static String reverse(String s){
		String s2 = "";
		for(int i = s.length()-1 ; i>=0; i--){
			s2 += s.charAt(i);
		}
		return s2;
	}*/
}
