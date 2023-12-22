import java.util.Scanner;
public class Main {
	
	public int match(int[] s, int[] t) {
		
		int tsize = t.length;
		int ssize = s.length;
		int amount = 0;
		for(int i = 0; i < tsize; i++) {
			
			for(int j = 0; j < ssize; j++) {
				if(t[i] == s[j]) {
					++amount;
					break;
				}
			}
			
		}
                return amount;
		
	}

        public static void main(String[] args){
       
        	Main program = new Main();
		Scanner in = new Scanner(System.in);
		int ssize = in.nextInt();
		int[] s = new int[ssize];
		for(int i =0; i < ssize; i++) {
			s[i] = in.nextInt();
		}
		int tsize = in.nextInt();
		
		int[] t = new int[tsize];
		for(int i = 0; i < tsize; i++) {
			t[i] = in.nextInt();
		}
		
		System.out.println(program.match(s,t));
			

        }

}
