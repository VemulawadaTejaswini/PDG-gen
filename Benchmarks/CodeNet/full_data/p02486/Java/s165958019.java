import java.util.Scanner;



public class Main{

public static void main(String[] args){

	int x,n,count,i,j,k;

	Scanner sc = new Scanner(System.in);

	while(true){
		count=0;

		n=sc.nextInt();

		x=sc.nextInt();

		if(n==0&&x==0){

			break;

		}

		for(i=1;i<n-1;i++){

			for(j=2;j<n;j++){

				for(k=3;k<n+1;k++){
					if(i+j+k==x){
						count++;
					}
				}

			}

		}

		System.out.printf("%d\n",count);

	}



}

}