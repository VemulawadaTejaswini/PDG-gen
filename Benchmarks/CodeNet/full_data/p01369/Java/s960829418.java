import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ2252().doIt();
	}
	
	class AOJ2252{
		void doIt(){
			String a = "qwertasdfgzxcvbyuiophjklnm";
			char[] data = a.toCharArray();
			boolean[] isRL = new boolean[a.length()];
			HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
			for(int i=0;i<15;i++)isRL[i] = true;
			for(int i=0;i<a.length();i++)map.put(data[i], isRL[i]);
			while(in.hasNext()){
				char input[] = in.next().toCharArray();
				if(input[0]=='#')break;
				int cnt = 0;
				boolean before = map.get(input[0]);
				for(int i=1;i<input.length;i++){
//					System.out.println(map.get(input[i]));
					if(map.get(input[i])!=before)cnt++;
					before = map.get(input[i]);
				}
				System.out.println(cnt);
			}
		}
	}
}