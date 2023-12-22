import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),max=0;
	  for(int i=1;i<=n;i++) {
		  int count=0,f=0;
		  for(int x=1;x<=100;x++) {
			  for(int y=x;y<=100;y++) {
				  for(int z=y;z<=100;z++) {
					  f=x*x+y*y+z*z+x*y+y*z+z*x;
					  if(f==i) {
						  if(x!=y&&y!=z&&z!=x)count+=6;
						  else if(x==y&&y==z)count++;
						  else count+=3;
					  }
				  }
			  }
		  }
		  System.out.println(count);
	  }
  }
}
