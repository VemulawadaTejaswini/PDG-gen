import java.util.Scanner;
public class Main{
	int tate;
	int yoko;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		tate = sc.nextInt();
		yoko = sc.nextInt();
		System.out.println((tate*yoko)+" "+(tate*2+yoko*2));
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();
	}
}