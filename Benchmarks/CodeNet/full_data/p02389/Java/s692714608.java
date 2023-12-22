import java.util.Scanner;
public class Main{
	int a,b,nagasa,menseki;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		menseki = a*b;
		nagasa = a*2+b*2;
		System.out.print(menseki+" "+nagasa);
		System.out.println();
	}
	
    public static void main(String args[]){
        Main obj = new Main();
        obj.solve();
    }
}