import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scaner1=new Scanner(System.in);
		int len=scaner1.nextInt();
		Scanner scaner2=new Scanner(System.in);
		String[] a=scaner2.nextLine().split(" ");
		int[] array=new int[len];
		for(int i=0;i<len;i++){
			array[i]=Integer.parseInt(a[i]);
		}
		reversing(array);
	}
	
	static void reversing(int[] array){
		for(int i=array.length-1;i>=0;i--){
			System.out.println(array[i]);
		}
	}

}