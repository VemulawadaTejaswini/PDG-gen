import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int scoreT = 0, scoreH = 0, diff;
        
        for (int i=0; i<n; i++) {
            String[] cardStr = in.readLine().split(" ");
            if ((diff = cardStr[0].compareToIgnoreCase(cardStr[1])) == 0) {
                scoreT++;
                scoreH++;
            } else if (diff > 0) {
                scoreT += 3;
            } else {
                scoreH += 3;
            }
        }
        
        System.out.println(scoreT + " " + scoreH);
    }
}