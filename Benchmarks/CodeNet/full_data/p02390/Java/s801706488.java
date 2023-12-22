/*
2725 ??´??¨?????? 1_4
*/
import java.util.Scanner;

    public class Main{
        public void solve(){
        Scanner sc = new Scanner(System.in);
        int byo,h,m,s;
		byo=sc.nextInt();
		h=byo/3600;
		m=(byo%3600)/60;
		s=(byo%3600%60)/60;
		System.out.println(h+":"+m+":"+s);
        }
    public static void main(String[]args){
    Main obj = new Main();
    obj.solve();
    }
    }