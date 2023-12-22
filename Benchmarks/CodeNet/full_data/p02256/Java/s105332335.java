import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,j,k,x,y,d,ax,ay,G=0;
		Scanner sc=new Scanner(System.in);
		x=Integer.parseInt(sc.next());
		y=Integer.parseInt(sc.next());
		
		if(x>y){
		int g[]=new int[x+1];
		}
		else{
			int g[]=new int[y+1];
		}
		k=0;
		for(i=1;i<=x;i++){
			ax=x%i;
			ay=y%i;
			
			if(ax==0&&ay==0){
				G=i;
				
			}
		}
		System.out.println(G);
	}

}