import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] cin =new int[10];
		int[] cout=new int[10];
		int temp;
		int i=0;
		int j=0;
		while(true){
			temp=scan.nextInt();
			if(temp!=0){
				cin[i]=temp;
				i++;
			}
			else{
				i--;
				cout[j]=cin[i];
				j++;
			}
			if(i==0){
				break;
			}

		}
		for(int k=0;k<j;k++){
			System.out.println(cout[k]);
		}
	}

}