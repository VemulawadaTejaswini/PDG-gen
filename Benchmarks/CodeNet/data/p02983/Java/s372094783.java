import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		int min=0;
		if(L%2019==0||R%2019==0||L/2019<R/2019){
			System.out.println(0);
			return;
		}

		for(int i=L;i<R;i++){
			for(int j=i+1;j<=R;j++){
				int a=(i*j)%2019;
				if((i==L&&j==L+1)||min>a){min=a;}
			}
		}
		System.out.println(min);
	}
}