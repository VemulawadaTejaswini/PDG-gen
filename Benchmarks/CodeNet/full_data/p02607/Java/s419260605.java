import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int  n=scn.nextInt();
		int []arr =new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			int val = scn.nextInt();
			if((i+1)%2!=0){
			if((i+1)%2==(val%2)){
				count++;
			}
			}
		}
		System.out.println(count);

	}

}