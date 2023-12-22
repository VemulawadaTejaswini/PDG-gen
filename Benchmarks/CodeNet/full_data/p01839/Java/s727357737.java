import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
                int n = sc.nextInt();
                boolean can = true;
                Stack<String> talk = new Stack<String>();
                for(int i=1;i<=n&&can==true;i++) {
                	String t = sc.next();
                	if(t.equals("Un")) {
                		if(!talk.pop().equals("A") || talk.isEmpty())
                			can = false;
                	}
                	else
                		talk.add(t);
                }
                if(can && talk.isEmpty())
                	System.out.println("YES");
                else
                	System.out.println("NO");
        }
    }
}

