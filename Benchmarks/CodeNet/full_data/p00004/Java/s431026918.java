import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int[] c=new int[6];
		double x,y;
		while(scan.hasNext()){
			for(int i=0;i<c.length;i++){
				c[i]=scan.nextInt();
			}
			if(c[0]==0){
				y=c[2]/(double)c[1];
				x=(c[5]-c[4]*y)/(double)c[3];
			}else if(c[1]==0){
				x=c[2]/(double)c[0];
				y=(c[5]-c[3]*x)/(double)c[4];
			}else if(c[3]==0){
				y=c[5]/(double)c[4];
				x=(c[2]-c[1]*y)/(double)c[0];
			}else if(c[4]==0){
				x=c[5]/(double)c[3];
				y=(c[2]-c[0]*x)/(double)c[1];
			}else{
				x=(c[4]*c[2]-c[1]*c[5])/(double)(c[4]*c[0]-c[1]*c[3]);
				y=(c[2]*c[3]-c[0]*c[5])/(double)(c[1]*c[3]-c[0]*c[4]);
			}
			System.out.printf("%.3f %.3f",x,y);
		}
		scan.close();
	}
}