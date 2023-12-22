import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,data,i;
		int ans[]=new int[4000];
		long price,k;
		while(true){
			i=0;
			n=sc.nextInt();
			if(n==0) break;
			while(n--!=0){
				data=sc.nextInt();
				price=sc.nextLong();
				k=sc.nextLong();
				if(1000000<=price*k){
					ans[i]=data;
					i++;
				}
			}//àwhile
			if(i==0) System.out.println("NA");
			else{
				for(int j=0;j<i;j++){
					System.out.println(ans[j]);
				}
			}//
		}//Owhile
	}
}