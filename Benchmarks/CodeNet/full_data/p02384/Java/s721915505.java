import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			x = in.readLine();
			Dice d = new Dice (x.split(" "));

			int num = Integer.parseInt(in.readLine());
			for (int i = 0; i < num; i++) {
				String q = in.readLine();
				System.out.println(d.getAns(q));
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

class Dice {
	private int t, b, n, s, e, w;
	private HashMap<String, String> str = new HashMap<String, String>();
	
	public Dice(String[] num) {
		t = Integer.parseInt(num[0]);
		s = Integer.parseInt(num[1]);
		e = Integer.parseInt(num[2]);
		w = Integer.parseInt(num[3]);
		n = Integer.parseInt(num[4]);
		b = Integer.parseInt(num[5]);
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == j) continue;
				
				int index = getE(i * 6 + j);
				str.put(num[i] + " " + num[j], num[index]);
			}
		}
	}
	
	public String getAns(String pat) {
		return str.get(pat);
	}
	
	public int getE(int num) {
		switch (num) {
		case 1:
		case 11:
		case 34:
		case 24:
			return 2;
		case 2:
		case 17:
		case 33:
		case 18:
			return 4;
		case 4:
		case 29:
		case 31:
		case 6:
			return 3;
		case 3:
		case 23:
		case 32:
		case 12:
			return 1;
		case 22:
		case 26:
		case 13:
		case 9:
			return 5;
		case 27:
		case 19:
		case 8:
		case 16:
			return 0;	
		}
		return 0;
	}
	
	public void move(char c) {
		int tmp = 0;
		
		switch (c) {
		case 'N' :
			tmp = t;
			t = s;
			s = b;
			b = n;
			n = tmp;
			break;
		case 'S' :
			tmp = t;
			t = n;
			n = b;
			b = s;
			s = tmp;
			break;
		case 'E' :
			tmp = t;
			t = w;
			w = b;
			b = e;
			e = tmp;
			break;
		case 'W' :
			tmp = t;
			t = e;
			e = b;
			b = w;
			w = tmp;
			break;
		}
	}

	public int getTop() {
		return t;
	}
}