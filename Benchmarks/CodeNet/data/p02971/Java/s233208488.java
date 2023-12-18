import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		int tmp[] = new int[n];
		for(int i=0;i<n;i++){
			tmp[i]=a[i];
		}
		for(int j=0;j<a.length-1;j++){
			for(int k=1;k<a.length;k++){
				if(tmp[k-1]<tmp[k])
				{
					int t = tmp[k];
					tmp[k] = tmp[k-1];
					tmp[k-1] = t;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			if(tmp[0]!=a[i]){
				System.out.println(tmp[0]);
			}else{
				System.out.println(tmp[1]);
			}
		}

	}
}
