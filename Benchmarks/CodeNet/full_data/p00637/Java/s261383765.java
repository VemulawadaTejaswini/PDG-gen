
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int z = 0;
		int i = 0;
		for(int kk=0;kk<1000000;kk++){
			int n = sc.nextInt();
			if(n==0){
				System.exit(0);
			}else{
				int a[] = new int[n]; 
				a[0]= sc.nextInt();
				for(i=1;i<n;i++){
					a[i] = sc.nextInt();
					if((a[i-1]+1)==a[i]){
					}else{
						if(a[z]==a[i-1]){
							System.out.print(a[i-1]+" ");
							z=i;
						}else{
							System.out.print(a[z]+"-"+a[i-1]+" ");
							z=i;
						}
					}
				}
				if(a[z]==a[i-1]){
					System.out.print(a[i-1]);
				}else{
					System.out.print(a[z]+"-"+a[i-1]);
				}
				System.out.println();
				z=0;
			}
		}
	}

}