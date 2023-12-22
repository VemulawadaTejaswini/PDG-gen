import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int  h=sc.nextInt();
		int  w=sc.nextInt();
		int i;
		int t;
		int tag=0;
		for(i=0;i<h;i++){
			for(t=0;t<w;t++){
				if((i%2)==0){
					if(tag==0){
				System.out.print("#");
				tag=1;
				continue;
			}
				if(tag==1){
					System.out.print(".");
					tag=0;
				}
		}
		if((i%2)==1){
					if(tag==0){
				System.out.print(".");
				tag=1;
				continue;
			}
				if(tag==1){
					System.out.print("#");
					tag=0;
				}
		}
		}
		tag=0;
		System.out.println();
	}
}
}