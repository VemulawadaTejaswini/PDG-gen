import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
int[] arr=new int[n];
for(int i =0;i<n;i++){
	arr[i]=sc.nextInt();
}
Arrays.sort(arr);
boolean b=true;
for (int i=0;i<n-1;i++){
	if(arr[i]==arr[i+1]){
		b=false;
		break;
	}
}
	if(b==true){
		System.out.println("YES");
	}
	else{
		System.out.println("NO");
	}
}
}
