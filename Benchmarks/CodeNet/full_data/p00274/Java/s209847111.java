import java. util.Scanner;
public class  Main{
	Scanner sc=new Scanner(System.in);
	int n,k;
	int a=0;
	void a(){
		while(true){
			n=sc.nextInt();
			if(n==0)break;
			boolean flag=false;
			for(int i=0; i<n; i++){
				k=sc.nextInt();
				if(k>0)a++;
				if(k>1)flag=true;
			}
			if(!flag){ 
				System.out.println("NA");
			}else{ 
				System.out.println(a+1);
			}
		}
	}
	
	public static void main(String[]agrs){
		new Main().a();
	}
}