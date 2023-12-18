import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
      	int b[]=new int[a];
      int sum=0;
      	for(int i=0;i<a;i++){b[i]=scan.nextInt();sum+=b[i];}
      int c=scan.nextInt();
      for(int i=0;i<c;i++){
      int x=scan.nextInt();
      int y=scan.nextInt();
      System.out.println(sum-b[x-1]+y);
      }
}
}
