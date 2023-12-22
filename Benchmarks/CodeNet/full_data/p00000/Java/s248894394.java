public class Main {
	public static void main(String[] args){
		Toi junbi = new Junbi1();
		junbi.solve();
	}
}

interface Toi{
	public void solve();
}

class Junbi1 implements Toi{
	public void solve(){
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
}
