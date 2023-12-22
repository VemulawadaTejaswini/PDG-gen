import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		String b;
		String c[];
		while((b = a.readLine()) != null){
			c = b.split(" ");
			print_iu(c[1],c[2],c[0]);
		}
	}

	static void print_iu(String a, String b, String x){
		int i = 0,j = 0;
		boolean y;
		if(x.charAt(0) == 'i'){
			y = false;
		} else {
			y = true;
		}
		while(i < a.length() && j < b.length()){
			if(a.charAt(i) == b.charAt(j)){
				System.out.print(a.charAt(i));
				++i;
				++j;
			} else if(a.charAt(i) == '('){
				int c = 0;
				while(true){
					if(y){
						System.out.print(a.charAt(i));
					}
					if(a.charAt(i) == '('){
						++c;
					} else if(a.charAt(i) == ')'){
						--c;
						if(c == 0){
							++i;
							break;
						}
					}
					++i;
				}
			} else if(b.charAt(j) == '('){
				int c = 0;
				while(true){
					if(y){
						System.out.print(b.charAt(j));
					}
					if(b.charAt(j) == '('){
						++c;
					} else if(b.charAt(j) == ')'){
						--c;
						if(c == 0){
							++j;
							break;
						}
					}
					++j;
				}
			}
		}
		System.out.println("");
	}
}