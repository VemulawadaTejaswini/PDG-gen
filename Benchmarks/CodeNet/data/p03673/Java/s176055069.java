import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		int a[]=new int[n];
		int z=0,y=0,x=1,i=n/2-1;
		if(n%2==1)
			i++;
		while(z<n){
			if(z%2==0){
				a[i-y]=stdIn.nextInt();
				y++;
			}
			else{
				a[i+x]=stdIn.nextInt();
				x++;
			}
			z++;
		}z--;
		if(n%2==1){
			z=0;
			while(z<n){
				System.out.print(a[z]+" ");
				z++;
			}
		}
		else
			while(z>=0){
				System.out.print(a[z]+" ");
				z--;
			}
	}
}