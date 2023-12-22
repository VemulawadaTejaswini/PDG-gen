import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0 && W==0){break;}
			for(int j=1;j<=H;j++){
				for(int i=1;i<=W;i++){
					if(j%2==1){
						if(i%2==1){System.out.print("#");}
						if(i%2==0){System.out.print(".");}
					}
					else{
						if(i%2==1){System.out.print(".");}
						if(i%2==0){System.out.print("#");}
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}