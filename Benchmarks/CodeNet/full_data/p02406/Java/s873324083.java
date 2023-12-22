import java.util.Scanner;

public class Main{
public static void main(String[] args){
	int n,i,x;
	Scanner sc = new Scanner(System.in);

	n=sc.nextInt();
	for(i=1;i<=n;i++){
		x=i;
		if(x%3==0){
			System.out.printf(" %d",i);
		}else{
			while(x!=0){
				if(x%10==3){
					System.out.printf(" %d",i);
					break;
				}
				x/=10;
			}
		}
	}
	System.out.printf("\n");

}
}