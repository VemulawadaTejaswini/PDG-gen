import java.util.*;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> bsb= new ArrayList<String>();
	static ArrayList<String> brr = new ArrayList<String>();

	public static void main(String[] args) {
		while(sc.hasNext()){
			if(sub(sc.next())){}
			else break;
		}

		for(int i = 0; i < brr.size(); i++){
			System.out.println(brr.get(i));
		}
	}

	public static boolean sub(String temp){
		if(temp.compareTo("push") == 0){
			String k = sc.next();
			bsb.add(k);
			return true;
		}
		else if(temp.compareTo("pop") == 0){
			int lastIndex = bsb.size() - 1;
			String block = bsb.get(lastIndex);
			bsb.remove(lastIndex);
			brr.add(block);
			return true;
		}
		else if(temp.compareTo("quit") == 0)return false;
		else return true;
	}
}