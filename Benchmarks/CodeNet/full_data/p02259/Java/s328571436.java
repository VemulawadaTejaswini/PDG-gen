import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int[] su=new int[100];
	int sum;
	void go(){
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++){
			su[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n+1; j++){
				if(su[i]<su[j]){
					sum++;
					int a=su[j];
					su[j]=su[i];
	  			  	su[i]=a;
				}
			}
		}
		for(int i=0; i<n; i++){
			if(i<n-1){
				System.out.print(su[i]+" ");
			}else{
				System.out.println(su[i]);
			}
		}
		System.out.println(sum);
		
	}
	public static void main(String[]agrs){
		new Main().go();
	}
}