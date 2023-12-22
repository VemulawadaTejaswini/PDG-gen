import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int[] numArray=new int[n];
			int[] resArray=new int[n];
			int ptr=0;
			for(int i=0;i<n;i++){
				int num=sc.nextInt();
				int price=sc.nextInt();
				int volume=sc.nextInt();
				boolean flag=true;
				int j;
				for(j=0;j<ptr;j++){
					if(numArray[j]==num){
						flag=false;
						break;
					}
				}
				if(flag){
					numArray[i]=num;
					resArray[i]=price*volume;
					ptr++;
				}else{
					resArray[j]+=(price*volume);
				}
			}
			boolean flag=false;
			for(int i=0;i<n;i++){
				if(resArray[i]>=1000000){
					System.out.println(numArray[i]);
					flag=true;
				}
			}
			if(!flag){
				System.out.println("NA");
			}
		}
	}
}