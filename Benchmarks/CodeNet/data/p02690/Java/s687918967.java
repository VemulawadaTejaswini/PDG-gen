import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int X=stdIn.nextInt();
		long key[]=new long[101];
		for(long i=0;i<=100;i++){
			key[(int)i]=(long) Math.pow(i,5);
		}
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
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
