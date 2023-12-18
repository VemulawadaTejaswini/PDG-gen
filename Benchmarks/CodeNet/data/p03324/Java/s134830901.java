import java.util.Scanner;

public class mygraph {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str="00";
	  String nbefore="1";
	  int N,D,n,ans;
	  D=sc.nextInt();
	  N=sc.nextInt();
	  for(int i=0;i<D;i++) {
		  nbefore=nbefore+str;

	  }
	  n=Integer.parseInt(nbefore);
	  ans=n*N;
	  System.out.println(ans);
  }
}
