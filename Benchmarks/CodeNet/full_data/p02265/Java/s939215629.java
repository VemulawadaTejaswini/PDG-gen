import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i,j,n,num,start=0,end=0,f=0;
		String com="";
		n=scan.nextInt();
		int[] list=new int[n];
		for(i=0;i<n;i++){
			com=scan.next();
			switch(com){
				case "insert":
					num=scan.nextInt();
					for(j=end-1;j>=start;j--){
						list[j+1]=list[j];
					}
					list[start]=num;
					end++;
					break;
				case "delete":
					num=scan.nextInt();
					for(j=start;j<end;j++){
						if(list[j]==num){
							f=1;
							break;
						}
					}
					if(f==1){
						for(j+=0;j<end-1;j++){
							list[j]=list[j+1];
						}
						end--;
					}
					f=0;
					break;
				case "deleteFirst":
					start++;
					break;
				case "deleteLast":
					end--;
					break;
				default:
					continue;
			}
		}
		for(i=start;i<end;i++){
			System.out.print(list[i]);
			if(i<end-1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
