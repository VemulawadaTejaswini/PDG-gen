import java.util.Scanner;
public class Main{
     
    public void solve(){
		Scanner sc = new Scanner(System.in);
		
        int a,b,c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a < b && b <c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
    }			
       public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
     }
}