import java.util.*;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		int Alice=0;
		int Bob=0;

		Arrays.sort(a);

		for(int i=n-1;i>=0;i--){
			if((n-1)%2==0){
				if(i%2==0){
					Alice+=a[i];
				}else{
					Bob+=a[i];
				}
			}else{
				if(i%2!=0){
					Alice+=a[i];
				}else{
					Bob+=a[i];
				}
			}
		}


		System.out.println(Alice-Bob);


	}
}
