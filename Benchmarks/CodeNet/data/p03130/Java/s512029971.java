import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int a[]=new int[5];
		int z=0,y=0,fin=0;
		while(z<6){
			y=stdIn.nextInt();
			if(a[y]>2){
				fin=1;
				break;
			}
			else
				a[y]++;
			z++;
		}z=1;y=0;
		if(fin==1)
			System.out.println("NO");
		else{
			while(z<5){
				if(a[z]==2)
					y++;
				z++;
			}
			if(y==2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}