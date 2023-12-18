import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = scan.nextInt();
		}
		boolean ans = true;
		for(int i=0;i<n;i++){
		      for(int j=n-1;j>i;j--){
					if(a[j]<a[j-1]){
					  int t=a[j];
					  a[j]=a[j-1];
					  a[j-1]=t;
					  }
		      }
		    }
		
		if(n%2 == 0){
			for(int j = 0;j<(n/2);j++){
				if(a[j*2] != a[j*2+1]){
					ans = false;
				}
			}
		}else{
			for(int j = 0;j<(n-1)/2;j++){
				if(a[0] != 0){
					ans = false;
				}
				if(a[j*2 + 1] != a[j*2 +2]){
					ans = false;
				}
			}
		}
		
		if(ans == true){
			if(n%2 == 0){
				System.out.println((int)( Math.pow(2,(n/2) % (Math.pow(10, 9)+7) ) ));
			}else{
				System.out.println((int)( Math.pow(2,((n-1)/2) % (Math.pow(10, 9)+7) ) ));
			}
		}else{
			System.out.println(0);
		}
		
		
	}
	

}