import java.util.Scanner;

    public class Main{
        public void solve(){
        Scanner sc = new Scanner(System.in);
        int a,b,seki,syu;
		a=sc.nextInt();
		b=sc.nextInt();
		seki = a*b;
		syu = (a*2)+(b*2);
		System.out.println(seki+" "+syu);
        }
    public static void main(String[]args){
    Main obj = new Main();
    obj.solve();
    }
    }