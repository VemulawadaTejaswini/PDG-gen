import java.util.Scanner;
public class Main{
     
    public void solve(){
		Scanner sc = new Scanner(System.in);
		
        int h,m,s;
		int jikan = sc.nextInt();
		
			h = jikan / 3600;
			m = (jikan - h * 3600 ) / 60;
			s = ((jikan - h * 3600 ) - m *60);
			
			System.out.println(h+":"+m+":"+s);
		
    }

       public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
     }
}