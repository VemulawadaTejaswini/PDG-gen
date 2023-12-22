import java.util.Scanner;
class Main{
	
	int high;
    int low;
    int sa;
	int i=0;
	
	public void solve(){
    Scanner sc=new Scanner(System.in);
		
        while(i<7){
			high=sc.nextInt();
			low=sc.nextInt();
			sa=high-low;
			System.out.println(sa);
			i++;
        }
	}
	public static void main(String[] args){
        Main obj =new Main();
        obj.solve();
    }
}