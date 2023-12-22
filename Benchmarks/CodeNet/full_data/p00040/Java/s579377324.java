import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = Integer.parseInt(sc.nextLine());
		while(dataset-- > 0){
			String s = sc.nextLine();
			boolean isOK = false;
			for(int a = 1; a <= 26; a++){
				for(int b = 1; b <= 26; b++){
					boolean isvalid = true;
					int [] hash = new int[26];
					for(int i = 0; i <= 25; i++){
						hash[(i * a + b ) % 26]++;
						if(hash[i]==2){
							isvalid = false;
							break;
						}
					}
					if(isvalid){
						StringBuilder sb = new StringBuilder(s);
						for(int i = 0; i < sb.length(); i++){
							int c = sb.charAt(i) - 'a';
							if(sb.charAt(i) == ' ') continue;
							sb.setCharAt(i, (char)((c * a + b) % 26 + 'a'));
						}
						boolean res = containsthat(sb.toString());
						if(res){
							isOK = true;
							System.out.println(sb.toString());
							break;
						}
					}
				}
				if(isOK){
					break;
				}
			}
		}
	}

	private boolean containsthat(String string) {
		String [] s = string.split(" ");
		for(int i = 0; i < s.length; i++){
			if(s[i].equals("this") || s[i].equals("that")){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}