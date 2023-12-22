import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int A[]=new int[10000];
        int i=0;
		for(i=0;i<10000;i++){
			A[i]=scan.nextInt();
		    if(A[i]==0)break;
		}

		for(int j=0;j<i;j++){
			System.out.println("Case "+ (j+1) +": "+A[j]);
		}
		
	}
}
