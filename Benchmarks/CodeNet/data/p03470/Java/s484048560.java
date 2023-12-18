import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		int [] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=scn.nextInt();
		}
		int temp;
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int count=0;
		for(int i=0;i<num-1;i++) {
			if(arr[i]!=arr[i+1]) {
				count++;
			}
		}
		System.out.println(count+1);
	}
}