import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length-1; i++){
			for(int j=1;j<a.length;j++){
			if(a[i]<a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}		
}

		for(int i = 0 ; i < 3 ; i++){
			System.out.println(a[i]);
		}
		
	}

}