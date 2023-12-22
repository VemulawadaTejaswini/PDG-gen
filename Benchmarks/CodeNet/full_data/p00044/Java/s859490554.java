import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			for(int i=n-1;i>=2;i--){
				boolean flag=true;
				for(int j=2;j<Math.sqrt(i)+1;j++){
					if(i%j==0){
						flag=false;
						break;
					}
				}
				if(flag||i==2){
					System.out.print(i+" ");
					break;
				}
			}
			for(int i=n+1;i<50000;i++){
				boolean flag=true;
				for(int j=2;j<Math.sqrt(i)+1;j++){
					if(i%j==0){
						flag=false;
						break;
					}
				}
				if(flag){
					System.out.println(i);
					break;
				}
			}
		}
	}
}