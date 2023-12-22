import java.util.*;

public class Main {
	
	String [] dic = {"ld", "mb", "mp", "nc", "nd", "ng", "nt", "nw", "ps", "qu", "cw", "ts"};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		sc.nextLine();
		int [][] data = new int[38][38];
		while(dataset-- > 0){
			String s = sc.nextLine();
			int prevind = -1;
			for(int i = 0; i < s.length(); i++){
				char c1 = s.charAt(i);
				if(c1 == ' '){
					prevind = -1;
					continue;
				}
				boolean isfind = false;
				if(i + 1 < s.length()){
					char c2 = s.charAt(i + 1);
					int res = find(c1,c2);
					if(res >= 0){
						isfind = true;
						if(prevind == -1){
							
						}
						else{
							data[prevind][res + 26]++;
						}
						prevind = res + 26;
						i++;
					}
				}
				if(! isfind){
					if(prevind == -1){
						
					}
					else{
						data[prevind][c1 - 'a']++;
					}
					prevind = c1 - 'a';
				}
			}
		}
		for(int i = 0; i < 38; i++){
			StringBuilder sb = new StringBuilder();
			int max = -1;
			int ind = -1;
			for(int j = 0; j < 38; j++){
				if(max < data[i][j]){
					max = data[i][j];
					ind = j;
				}
			}
			
			if(i < 26){
				sb.append((char)(i + 'a'));
			}
			else{
				sb.append(dic[i - 26]);
			}
			sb.append(" ");
			if(ind < 26){
				sb.append((char)(ind + 'a'));
			}
			else{
				sb.append(dic[ind - 26]);
			}
			sb.append(" " + data[i][ind]);
			System.out.println(sb.toString());
		}
	}

	private int find(char c1, char c2) {
		for(int i = 0; i < dic.length; i++){
			if(dic[i].charAt(0) == c1 && dic[i].charAt(1) == c2){
				return i;
			}
		}
		return -1;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}