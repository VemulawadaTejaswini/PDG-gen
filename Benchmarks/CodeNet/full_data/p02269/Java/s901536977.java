import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		CharacterList root = new CharacterList();
		String x = "";
		try {
			int lim = Integer.parseInt(in.readLine());

			for (int i = 0; i < lim; i++) {
				x = in.readLine();
				String[] param = x.split(" ");
				
				if (param[0].equals("insert")) {
					root.add(param[1]);
				} else {
					if (root.search(param[1]) == true) System.out.println("yes");
					else System.out.println("no");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class CharacterList {
	public static final int A = 0;
	public static final int T = 1;
	public static final int C = 2;
	public static final int G = 3;
	
	private CharacterList[] cl = null;
	
	private boolean set = false;
	
	public CharacterList() {
		cl = new CharacterList[4];
	}
	
	public void add(String param) {
		if (param.length() == 1) {
			set = true;
		}
		
		switch (param.charAt(0)) {
		case 'A' :
			cl[A] = new CharacterList();
			cl[A].add(param.substring(1));
			break;
		case 'T' :
			cl[T] = new CharacterList();
			cl[T].add(param.substring(1));
			break;
		case 'C' :
			cl[C] = new CharacterList();
			cl[C].add(param.substring(1));
			break;
		case 'G' :
			cl[G] = new CharacterList();
			cl[G].add(param.substring(1));
			break;
		}
	}
	
	public boolean search(String param) {
		if (param.length() == 1) {
			return set;
		}
		
		switch (param.charAt(0)) {
		case 'A' :
			if (cl[A] == null) return false;
			return cl[A].search(param.substring(1));
		case 'T' :
			if (cl[T] == null) return false;
			return cl[T].search(param.substring(1));
		case 'C' :
			if (cl[C] == null) return false;
			return cl[C].search(param.substring(1));
		case 'G' :
			if (cl[G] == null) return false;
			return cl[G].search(param.substring(1));
		}
		
		return false;
	}
}