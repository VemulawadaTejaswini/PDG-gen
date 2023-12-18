import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long s=sc.nextLong();
		long t=1000000000;
		if(s<t){
			System.out.print(1+" "+1+" "+2+" "+1+" "+1+" "+(s+1));
		}else{
			long cc=t;
			long x=1;
			long y=1;
			while(true){
				if(s%cc==0){
					x=cc;
					y=s/cc;
					break;
				}
				cc--;
			}
			System.out.print(1+" "+1+" "+(1+x)+" "+1+" "+1+" "+(y+1));
		}
		
	}
}


