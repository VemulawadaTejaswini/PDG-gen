import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	int x;
    	int y;
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		x=sc.nextInt();
    		y=sc.nextInt();
    		if(x==0 && y==0)
    		break;
    		if(x<y){
    			System.out.print(x+" "+y);
    		}else{
    			System.out.print(y+" "+x);
    		}
    		}
    }
    }
    
