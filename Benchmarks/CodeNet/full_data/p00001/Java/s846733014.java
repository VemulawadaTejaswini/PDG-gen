import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] a) {
		Scanner scan = new Scanner(System.in);
		int[] x=new int[10];
		int temp;
		for(int i=0;i<x.length;i++){
		x[i]=scan.nextInt();
		}
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++){
				if(x[i]>x[j]){
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);

	}

}