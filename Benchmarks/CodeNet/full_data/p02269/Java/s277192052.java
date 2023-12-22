
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

//implement a simple dictionary for [A,C,G,T] 1 ... 12
public class Main {
	public static final int max_size = (1 << 31) -1;
	
	public static BitSet dict = new BitSet(max_size);
	public static int translate(char c) {
		switch(c) {
		case 'A': return 1;
		case 'C': return 2;
		case 'G': return 3;
		case 'T':return 4;
		}
		
		return -1;
	}
	
	public static int translate(String c) {
		int code = 0;
		int base = 1;
		for(int i = 0; i < c.length(); i++) {
			code += translate(c.charAt(i))*base;
			base *= 5;
		}
		return code;
	}
	
	public static void insert(String gene) {
		dict.set(translate(gene));
	}
	
	public static boolean find(String gene) {
		return dict.get(translate(gene));
	}
	
	
	
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int len = cin.nextInt();
		String cmd, key;
		ArrayList<Boolean> answers = new ArrayList<Boolean>();
		
		for(int i = 0; i< len; i++){
			cmd = cin.next();
			key = cin.next();
			if(cmd.equals("insert")) {
				insert(key);
			}else if(cmd.equals("find")){
				answers.add(find(key));
			}
		}
		
		

		int i = 0;
		while(i < answers.size()) {
			System.out.println((answers.get(i))? "yes":"no");
			i++;
		}
		
		cin.close();
	}

}