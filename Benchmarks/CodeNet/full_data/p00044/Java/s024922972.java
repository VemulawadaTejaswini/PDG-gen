import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,j;
		boolean f[]=new boolean[6000];
		for(i=2;i<f.length;i++) f[i]=true;

		for(i=2;i<f.length;i++){
			if(f[i]){
				for(j=2;j*i<f.length;j++){
					f[j*i]=false;
				}
			}
		}//hurui

//		for(i=2;i<f.length;i++){
//			if(f[i]) System.out.println(i);
//		}
		
		while(sc.hasNext()){
			n=sc.nextInt();
			for(i=n-1;;i--){
				if(f[i]){
					System.out.print(i+" ");
					break;
				}
			}//for
			for(j=n+1;;j++){
				if(f[j]){
					System.out.println(j);
					break;
				}
			}
		}//while
	}
}