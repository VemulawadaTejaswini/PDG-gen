import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(r.readLine());
		String make = r.readLine();
		
		// START //
		int boards = 0;
		for(int i=0; i<num; i++){
			String old = r.readLine();
			for(int sp = (old.length() - make.length()) / (make.length() - 1); sp >= 0; sp--){
				for(int ip = 0; ip < sp * (make.length() - 1) + make.length(); ip++){
					int mp = 0;
					for(int op = ip; (mp < make.length()) && (op < old.length()) && (old.charAt(op) == make.charAt(mp)); mp++, op += sp + 1);
					boards += (mp == make.length()) ? 1 : 0;
				}
			}
		}
		
		System.out.println(boards);
		// E N D //
	}
}