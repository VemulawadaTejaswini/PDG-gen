import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int list[] = {100,101,102,103,104,105};

        int X = stdin.nextInt();
        int flag=0;

        int s = X%100;
        int d = X/100;
        if(s/5 <= d) {
        	System.out.print("1");
        }
        else if(s/4<=d) {
        	System.out.print("1");
        }
        else if(s/3<=d) {
        	System.out.print("1");
        }
        else if(s/2<=d) {
        	System.out.print("1");
        }
        else if(s/1<=d) {
        	System.out.print("1");
        }
        else if(s/9<d-1) {
        	System.out.print("1");
        }
        else if(s/8<d-1) {
        	System.out.print("1");
        }
        else if(s/7<d-1) {
        	System.out.print("1");
        }
        else if(s/6<d-1) {
        	System.out.print("1");
        }

        else {
        	System.out.print("0");
        }
	}
}
