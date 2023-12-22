import java.util.Scanner;
public class Main{
	int a,b,c;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a<b){
			if(b<c){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
	
    public static void main(String args[]){
        Main obj = new Main();
        obj.solve();
    }
}