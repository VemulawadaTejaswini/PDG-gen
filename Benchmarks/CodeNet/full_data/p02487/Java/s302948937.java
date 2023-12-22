import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int h=-1,w=-1;
		while(h!=0 && w!=0){
			h=sc.nextInt();
			w=sc.nextInt();
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++)System.out.printf("%c",(j==0 || j==w-1 || i==0 || i==h-1)?'#':'.');
				System.out.printf("\n");
			}
			if(h!=0 && w!=0)System.out.printf("\n");
		}
	}
}