import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int H=-1;
		int W=-1;
		
		int i,j;
		
		while (H!=0 && W!=0){
		H=sc.nextInt();
		W=sc.nextInt();
		
		for(i=0;i<H;i++){
			for(j=0;j<W;j++){
			if(i%2==0 && j%2==0){System.out.print("#");}
			else if(i%2==0 && j%2==1){System.out.print(".");}	
			else if(i%2==1 && j%2==0){System.out.print(".");}
			else if(i%2==1 && j%2==1){System.out.print("#");}
			}
			System.out.println("");
		}
		}
		System.out.println("");
	}		
}