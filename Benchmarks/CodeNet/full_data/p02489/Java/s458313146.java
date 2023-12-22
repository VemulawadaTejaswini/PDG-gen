import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
    
    
	for(int i = 1;;i++){
        

	int x = sc.nextInt();
        if(x != 0)
        {
	System.out.println("Case %d: %?\n",i,x);
        }
        else
        {
            break;
        }
        }
	
    }
        
}