import java.util.Scanner;
public class Main{
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
        
        int men = a*b;
        int syu = (a+b)*2;
		
		System.out.println(men);
		System.out.println(syu);
    }

             
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}