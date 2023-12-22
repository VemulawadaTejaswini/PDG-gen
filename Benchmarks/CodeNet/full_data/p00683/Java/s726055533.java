import java.util.*;

public class Main{
	//0032 starting
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int ds = Integer.parseInt(sc.nextLine());
		while(ds-- > 0){
			StringBuilder s = new StringBuilder(sc.nextLine());
			int pos = 0;
			int q = Integer.parseInt(sc.nextLine());
			while(q-- > 0){
				String com = sc.nextLine();
				String [] coms = com.split(" ");
				switch (coms[0].charAt(0)) {
				case 'f':
					if(coms[1].charAt(0) == 'c'){
						pos++;
						if(pos > s.length()) pos--;
					}
					else{
						pos = findFW(s, pos);
					}
					break;
				case 'b':
					if(coms[1].charAt(0) == 'c'){
						pos--;
						if(pos < 0) pos = 0;
					}
					else{
						pos = findBW(s, pos);
					}
					break;
				case 'i':
					String temp = com.substring(7);
					s.insert(pos, temp.replaceAll("\"", ""));
					pos += temp.length() - 2;
					break;
				case 'd':
					if(coms[1].charAt(0) == 'c'){
						if(pos != s.length()){
							s.deleteCharAt(pos);
						}
					}
					else{
						int res = findFW(s, pos);
						boolean flg = false;
						for(int i = pos; i <= res; i++){
							if(i == s.length())continue;
							if(s.charAt(i) != ' '){
								flg = true;
							}
						}
						if(flg){
							s.delete(pos, res);
						}
					}
					break;
				default:
					break;
				}
			}
			
			//print
			s.insert(pos, '^');
			System.out.println(s.toString());
		}
	}

	private int findFW(StringBuilder s, int pos) {
		if(s.length() == pos) return pos;
		int nowpos = pos;
		if(s.charAt(pos) == ' '){
			for(int i = pos; i < s.length(); i++){
				if(s.charAt(i) != ' '){
					nowpos = i;
					break;
				}
			}
			if(nowpos == pos){
				return s.length();
			}
		}
		for(int i = nowpos; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				return i;
			}
		}
		return s.length();
	}

	private int findBW(StringBuilder s, int pos) {
		if(pos == 0) return pos;
		int nowpos = pos-1;
		if(s.charAt(nowpos) == ' '){
			for(int i = nowpos; i >= 0; i--){
				if(s.charAt(i) != ' '){
					nowpos = i;
					break;
				}
			}
			if(nowpos == pos-1){
				return 0;
			}
		}
		for(int i =nowpos; i >= 0; i--){
			if(s.charAt(i) == ' '){
				return i + 1;
			}
		}
		return 0;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}