import java.util.Scanner;
class Main{

	public void solve(){
    Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a < b){
			if(b < c){
				System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		}else{
		    System.out.println("No");
		}
	}


	
	public static void main(String[] args){
        Main obj =new Main();
        obj.solve();
    }
}