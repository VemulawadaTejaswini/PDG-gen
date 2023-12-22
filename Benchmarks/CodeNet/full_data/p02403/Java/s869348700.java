import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[300];
		int[] b = new int[300];
		int i = 0;
		
		a[0] = 1;
		b[0] = 1;
		
		while(!(a[i] == 0 && b[i] == 0)){
			i++;
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();}
			
		for(int q=1; q<i; q++){
			for(int j=0; j<a[q]; j++){
				for(int h=0; h<b[q]; h++){
					System.out.print("#");}
				System.out.print("\n");}
				System.out.print("\n");}
	}
}
