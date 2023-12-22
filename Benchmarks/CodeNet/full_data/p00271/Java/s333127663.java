import java.util.Scanner;
public class Main{
    int high;
    int low;
    int sa;
    int a;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
		
        while(a < 7){
            high = sc.nextInt();
            low = sc.nextInt();
		    sa = high - low;
			System.out.println(sa);
		    a++;
        }
       
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
    
}