import java.util.Scanner;
public class Main{
    public void solve(){
        int t,y,men,syu;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        y=sc.nextInt();
        men=t*y;
        syu=t*2+y*2;
        System.out.println(men+" "+syu);
    }
	public static void main(String[]args){
		Main obj =new Main();
		obj.solve();
	}
}