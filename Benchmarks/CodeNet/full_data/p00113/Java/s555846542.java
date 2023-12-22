import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int p =sc.nextInt();
			int q = sc.nextInt();
			int x = p % q * 10;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; ; i++){
				int temp = (x % q) * 10;
				int temp2 = x / q;
				sb.append(temp2);
				if(temp == 0){
					System.out.println(sb.toString());
					break;
				}
				if(map.containsKey(temp)){
					System.out.println(sb.toString());
					StringBuilder anssec = new StringBuilder();
					int len = map.get(temp);
					for(int j = 0; j < len + 1; j++){
						anssec.append(" ");
					}
					for(int j = len; j < i; j++){
						anssec.append("^");
					}
					System.out.println(anssec.toString());
					break;
				}
				map.put(temp, i);
				x = temp;
			}
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}