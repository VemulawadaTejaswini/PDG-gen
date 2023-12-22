import java.util.*;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			int r=sc.nextInt();
			if(n==0||r==0)break;
			int[] dk=new int[n];
			for(int i=0;i<n;i++)dk[n-(i+1)]=i+1;
			while(r--!=0){
				int p=sc.nextInt();p-=1;
				int c=sc.nextInt();
				int[] temp=new int[p];
				for(int i=0;i<p;i++){
					temp[i]=dk[i];
				}
				for(int i=0;i<c;i++){
					dk[i]=dk[i+p];
				}
				for(int i=0;i<p;i++){
					dk[i+c]=temp[i];
				}
			}
			System.out.println(dk[0]);
		}
	}
}