import java.util.Arrays;
import java.util.*;
public class main {
	private static Scanner sc=new Scanner(System.in);
	static double xp,yp;
	public static void main(final String[] args) {
		while(sc.hasNextDouble()){
			double xm[]=new double[3];
			double ym[]=new double [3];
		 for (int i = 0; i < 3; i++) {
			 xm[i]=sc.nextDouble();
			 ym[i]=sc.nextDouble();
		  }
		 xp=sc.nextDouble();yp=sc.nextDouble();
		 Arrays.sort(xm);
		 Arrays.sort(ym);
		 for (int i = 0; i < 3; i++) {
			 if(xm[i]==xp&&ym[i]==yp)
				 break;
			 }
			 
		 
		 if(xm[0]<xp&&xm[2]>xp&&ym[0]<yp&&ym[2]>yp){
			 System.out.println("Yes");
					 }else{mm();}
		 
		 
		}
	}
	private static void  mm(){
		System.out.println("No");
		
	}

}