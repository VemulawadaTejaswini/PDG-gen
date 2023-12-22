import java.util.Scanner;

public class Main {
	

	public void solve(){
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < 9; i++){
        	String name = in.next();
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(name+" "+(a + b)+" "+(a *200 +b*300 ));
        	
        }
		
		return;
	}
	
    public static void main(String[] args) {
    	Main a = new Main();
    	a.solve();
	}
}