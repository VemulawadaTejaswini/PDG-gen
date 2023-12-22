import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        String w,t;
        w=scan.next();
        while(true) {
        	t=scan.next();
        	if(t.equals("END_OF_TEXT")) {
        		break;
        	}
        	else if(t.equals(w)) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}
