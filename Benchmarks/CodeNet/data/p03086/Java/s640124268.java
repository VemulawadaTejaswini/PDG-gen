import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String s [] = S.split("");
		//System.out.println(s[0].equals("A"));
		
		int l = S.length();
		
		int i=0;
		int ans = 0;
		while (i<l){
			int cnt = 0;
			if (s[i].equals("A")!=true && s[i].equals("T")!=true && s[i].equals("C")!=true && s[i].equals("G")!=true){
				i++;
			}
			
			else {
				cnt++;
				i++;
				
				while (i<l){
					if (s[i].equals("A")==true || s[i].equals("T")==true || s[i].equals("C")==true || s[i].equals("G")==true){
						i++;
						cnt++;
					}
					else
						break;
						
				}
			}
			ans = Math.max(ans,cnt);
			
		}
		System.out.println(ans);

	}

}
