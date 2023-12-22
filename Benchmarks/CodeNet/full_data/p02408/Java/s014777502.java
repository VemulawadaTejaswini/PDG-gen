import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String EOL = System.getProperty("line.separator");
	public static final char[] SUIT = {'S','H','C','D'};
	private int getSuitNum(char suit) {
		switch(suit) {
		case 'S': return 0;
		case 'H': return 1;
		case 'C': return 2;
		case 'D': return 3;
		}
		return -1;
	}
	
    public void exec() throws IOException {
    	boolean[][] trump = new boolean[4][13];
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);){
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
            	String[] str = br.readLine().split(" ");
            	char suitChar = str[0].charAt(0);
            	int number = Integer.parseInt(str[1]);
        		trump[getSuitNum(suitChar)][number-1] = true;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int suitNum=0; suitNum<SUIT.length; suitNum++) {
            	for(int number=1; number<=13; number++) {
            		if(!trump[suitNum][number-1]) {
            			sb.append(SUIT[suitNum]).append(' ').append(number).append(EOL);
            		}
            	}
            }
            out.print(sb.toString());
            out.flush();
    	}
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}