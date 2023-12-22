import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int h =sc.nextInt();
		int w=sc.nextInt();
	    
		while(true){
			if(h==0 && w==0) break;
			StringBuilder sh1 = new StringBuilder();
	        for (int i = 0; i < w/2; i++) {
	            sh1.append("#.");
	        }
	        if(sh1.length()<w) sh1.append("#");
	
	        StringBuilder sh2 = new StringBuilder();
	        for (int i = 0; i < w/2; i++) {
	            sh2.append(".#");
	        }
	        if(sh2.length()<w) sh2.append(".");
	
	        for(int i=0;i<h;i++){
	        	if(i%2==0) System.out.println(sh1);
	        	if(i%2==1) System.out.println(sh2);
	        }
	        System.out.println();
	        
			h =sc.nextInt();
			w=sc.nextInt();
		}
	}

}