import java.util.Scanner;
public class Main{
	int max,min,a;
    
    public void solve(){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=7;i++){
		max=sc.nextInt();
		min=sc.nextInt();
    System.out.println(max-min);
		}
	}
    public static void main(String[] args){
        Main obj = new Main();
       obj.solve(); 
    }
}