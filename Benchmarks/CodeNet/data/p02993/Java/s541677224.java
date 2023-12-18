import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        String data[] = new String[4];
        for (int i = 0; i < 4; i++) {
            data[i] = S.substring(i, i+1);
        }

        int judge = 0;
        for (int i = 0; i < 3; i++) {
            if (data[i].equals(data[i+1])) {
                judge++;
            }
        }

        if (judge > 0) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
	}
}
