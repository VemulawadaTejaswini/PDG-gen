import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		sc.useDelimiter("\\s"); 
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0 && y==0)break;
			if(x>y){
				int z=x;
				x=y;
				y=z;
			}
			System.out.printf("%d %d\n",x,y);
			}
		}
	}