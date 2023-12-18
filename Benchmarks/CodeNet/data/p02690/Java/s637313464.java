import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int X=stdIn.nextInt();
		long key[]=new long[501];
		for(long i=0;i<=500;i++){
			key[(int)i]=(long) Math.pow(i,5);
		}
		for(int i=0;i<=500;i++){
			for(int j=0;j<=500;j++){
				if(key[i]-key[j]==X){
					System.out.println(i);
					System.out.println(j);
					System.exit(0);
				}
				if(key[i]+key[j]==X){
					System.out.println(i);
					System.out.println(-j);
					System.exit(0);
				}
			}
		}
	}
}
