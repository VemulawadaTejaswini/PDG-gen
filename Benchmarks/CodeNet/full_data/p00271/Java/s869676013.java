import java.util.Scanner;
public class Main{
    
    public void solve(){
		Scanner sc=new Scanner(System.in);
		int high;
		int low;
		int sa;
		
		
    
		for(int i=0;i<7;i++){
			
        high=sc.nextInt();
        low=sc.nextInt();
		sa=high-low;
   
	System.out.print(sa);
    
    }
	
    }

        
    public static void main(String[]args){
		
        Main obj =new Main();
        obj.solve();
    
    }
}