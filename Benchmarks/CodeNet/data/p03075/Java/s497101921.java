import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a[]=new int[5];
		int z=0,y=0,fin=0;
		while(z<5){
			a[z]=stdIn.nextInt();
			z++;
		}z=0;
		int k=stdIn.nextInt();
		while(z<5){
			y=z+1;
			while(y<5){
				if(a[y]-a[z]>k){
					fin=1;
					break;
				}
				y++;
			}
			z++;
		}
		if(fin==1)
			System.out.println(":(");
		else
			System.out.println("Yay!");
	}
}