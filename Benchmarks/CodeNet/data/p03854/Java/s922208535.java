import java.util.Scanner;

/**
 * https://abc049.contest.atcoder.jp/tasks/arc065_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		String ans = "YES";
		while(s.length()>0){
			if(s.startsWith("dream")){
				if(s.length()==5 || s.charAt(5)!='e' || (s.length()>=8 && s.charAt(7)=='a')){
					s = s.substring(5);
				}else if(s.startsWith("dreamer")){
					s = s.substring(7);
				}else{
					ans = "NO";
					break;
				}
			}else if(s.startsWith("eraser")){
				s = s.substring(6);
			}else if(s.startsWith("erase")){
				s = s.substring(5);
			}else{
				ans = "NO";
				break;
			}
		}
		System.out.println(ans);

	}

}