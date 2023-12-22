import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int W = (int)Integer.parseInt(sc.next());
    	int H = (int)Integer.parseInt(sc.next());
    	int x = (int)Integer.parseInt(sc.next());
    	int y = (int)Integer.parseInt(sc.next());
    	int r = (int)Integer.parseInt(sc.next());

    	if((x-r)<0 || (x+r)>W || (y-r)<0 ||(y+r)>H){
    		System.out.println("No");
    	}else {
    		System.out.println("Yes");
    	}
		}
    }
    
