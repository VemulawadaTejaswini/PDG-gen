import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        String w,t;
        w=scan.next();
        w=w.toLowerCase();
        while(true) {
        	t=scan.next();
        	if(t.equals("END_OF_TEXT")) {
        		break;
        	}
        	t=t.toLowerCase();
        	if(t.equals(w)) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}
