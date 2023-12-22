import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int val[]=new int[3];
		for(int i=0;i<3;i++){
			val[i]=sc.nextInt();
		}

		for(int i=0;i<3;i++){
			for(int j=2;j>0;j--){
				if(val[j-1]>val[j]){
					int x=val[j];
					val[j]=val[j-1];
					val[j-1]=x;
				}
			}
		}

		for(int i=0;i<3;i++)		System.out.print(val[i]+" ");
			}
}