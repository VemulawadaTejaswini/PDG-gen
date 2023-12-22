import java.util.Scanner;
public class Main {
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int i=0,j=0;
	        while(true){
	            int H=sc.nextInt();
	            int W=sc.nextInt();
	            if(H==0&&W==0)break;
	            if(H==1&&W==1)System.out.println("#");
	            else for(i=0;i<H;i++){
	                for(j=0;j<W;j++){
	                	if(i%2==1){
	                    System.out.print("#.");
	                	}else System.out.print(".#");
	                }
	                System.out.print("\n");
	        }
	    }
	}
	
}

