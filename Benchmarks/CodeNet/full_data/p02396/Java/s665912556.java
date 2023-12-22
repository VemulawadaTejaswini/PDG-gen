import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int i=0;
		int data[]=new int[10000];
		while(true){
			int x=sc.nextInt();

			if(x==0)	break;
			else{
				data[i]=x;
				i++;
			}
		}

		for(int j=0;j<i;j++)	System.out.println("Case "+(j+1)+": "+data[j]);
	}
}