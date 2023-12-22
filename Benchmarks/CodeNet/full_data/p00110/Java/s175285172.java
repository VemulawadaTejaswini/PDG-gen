import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] str = (sc.next()).split("=");
			String res = str[1];
			String[] st = new String[3];
			int s, t=0, m=str[0].length();
			String tmp = "";
			str[0] += " ";
			for(int i = 0; i < m; i++){
				String tmp2 = str[0].substring(i, i+1);
				if(check(tmp2)){
					tmp += tmp2;
				} else {
					st[t++] = tmp;
					tmp = "";
				}
			}
			st[t] = tmp;
			
			if((st[0].substring(0, 1)).equals("X")){
				s = 1;
			} else if((st[1].substring(0, 1)).equals("X")) {
				s = 1;
			} else if((res.substring(0, 1)).equals("X")){
				s = 1;
			} else {
				s = 0;
			}
			boolean f = false;
			for(int i = s; i <= 9; i++){
				String num = Integer.toString(i);
				String u = st[0];
				String v = st[1];
				String r = res;
				u = u.replaceAll("X", num);
				v = v.replaceAll("X", num);
				r = r.replaceAll("X", num);
				
				int p = Integer.parseInt(u) + Integer.parseInt(v);
				int q = Integer.parseInt(r);
				if(p == q){
					f = true;
					t = i;
					break;
				}
			}
			
			if(f){
				System.out.println(Integer.toString(t));
			} else {
				System.out.println("NA");
			}
		}
	}
	
	public boolean check(String v){
		if(v.equals("X")){
			return true;
		}
		
		for(int i = 0; i <= 9; i++){
			String t = Integer.toString(i);
			if(v.equals(t)){
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args){
		new Main();
	}
}