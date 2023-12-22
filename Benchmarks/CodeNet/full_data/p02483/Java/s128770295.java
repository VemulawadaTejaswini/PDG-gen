import java.util.Scanner;

public class Main{
public static void main(String[] args){
	int x[]=new int[3],temp,i,j,n=3;
	Scanner sc = new Scanner(System.in);

	x[0]=sc.nextInt();
	x[1]=sc.nextInt();
	x[2]=sc.nextInt();
	for(i=0;i<n-1;i++){
		for(j=n-1;j>i;j--){
			if(x[j-1]>x[j]){
				temp=x[j];
				x[j]=x[j-1];
				x[j-1]=temp;
			}
		}
	}

}
}