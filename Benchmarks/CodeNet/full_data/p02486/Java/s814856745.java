import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int n,x,num;
		Scanner in = new Scanner(System.in);
		
		while(true){
			num=0;
			
			n = Integer.parseInt( in.next() );
			x = Integer.parseInt( in.next() );
			
			if(n==0&&x==0)break;
			
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					for(int k=1;k<=n;k++){
						if( ( i!=j && i!=k ) && j!=k){
							if(i+j+k == x){
								num++;
							}
						}
					}
				}
			}
			
			System.out.println(num/6);
			
		}
	}
}