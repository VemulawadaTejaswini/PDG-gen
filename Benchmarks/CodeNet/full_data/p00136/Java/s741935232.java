import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] a = new int[6];
			
			double d;
			for(int i=0;i<n;i++){
				d = sc.nextDouble();
				if(d<165)a[0]++;
				else if(d>=165 && d<170)a[1]++;
				else if(d>=170 && d<175)a[2]++;
				else if(d>=175 && d<180)a[3]++;
				else if(d>=180 && d<185)a[4]++;
				else if(d>=185)a[5]++;
			}
			for(int i=0;i<6;i++){
				System.out.print((i+1) + ":");
				for(int j=0;j<a[i];j++){
					System.out.print("*");
				}
				System.out.println();
			}
				
		}
	
	}	
}