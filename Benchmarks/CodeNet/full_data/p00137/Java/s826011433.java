import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> list = new ArrayList<String>();
	static int caseNumber, n;
	public static void main(String[] args) {
		while(read()){

		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int j = sc.nextInt();
			caseNumber++;
			list.add(Integer.toString(j));
			solve();
		}
		return true;
	}
	static void solve(){
		calc();
		System.out.println("Case "+caseNumber+":");
		print();
		list.removeAll(list);
	}
	static void calc(){
		for(int k = 0; k < 11; k++){
			int x = Integer.parseInt(list.get(k));
			String s = Integer.toString(x*x);
			for(int i = s.length(); i < 8; i++){
				s = "0" + s;
			}
			String newS = "";
			for(int i = 2; i <= 5; i++){
				newS = newS + s.charAt(i);
			}
			list.add(newS);
		}
	}
	static void print(){
		for(int i = 1; i < 11; i++){
			int x = Integer.parseInt(list.get(i));
			System.out.println(x);
		}
	}
}