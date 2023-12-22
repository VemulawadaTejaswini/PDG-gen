import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		while(true){
			String[] line =sc.nextLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int x = Integer.parseInt(line[1]);
		//break	
			if(n==0 && x==0){
				break;
			}
			System.out.println(sum(n,x));
		}					

	}
	public static int sum(int n,int x){
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				for(int k=0;k<j;k++){
					if(x-3==i+j+k){
						count=count+1;
					}
				}
			}
		}
		return count;
	}
}