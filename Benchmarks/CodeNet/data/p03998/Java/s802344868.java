import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder a = new StringBuilder(scan.next());
        StringBuilder b = new StringBuilder(scan.next());
        StringBuilder c = new StringBuilder(scan.next());
        boolean hantei = true;
        char turn = a.charAt(0);
        a.deleteCharAt(0);
        char ans = ' ';

        while(hantei){
        	if(turn == 'a'){
        		if(a.length() == 0 ){
        			ans = 'A';
        			hantei = false;
        			break;
        		}
        		
        		turn = a.charAt(0);
        		a.deleteCharAt(0);
        	}

        	if(turn == 'b'){
        		if(b.length() == 0 ){
        			ans = 'B';
        			hantei = false;
        			break;
        		}

        		turn = b.charAt(0);
        		b.deleteCharAt(0);
        	}

        	if(turn == 'c'){
        		if(c.length() == 0 ){
        			ans = 'C';
        			hantei = false;
        			break;
        		}

        		turn = c.charAt(0);
        		c.deleteCharAt(0);
        	}

        }

        System.out.println(ans);
    }
}