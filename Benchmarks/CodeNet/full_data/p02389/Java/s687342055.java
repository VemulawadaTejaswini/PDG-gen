import java.util.Scanner;
public class Main6{
    int tate,yoko;
	int men,syu;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		tate = sc.nextInt();
		yoko = sc.nextInt();
		System.out.print(tate*yoko);
		System.out.print(" "+(tate+yoko)*2);
		}
    public static void main(String[] args){
        Main6 obj = new Main6();
        obj.solve();
    }
}