import java.util.Scanner;

  
public class Main {
	public static void swap(int a,int b){
		int x;
		x=a;
		a=b;
		b=x;
		System.out.println(a + " "+ b);
		return;
	}
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  int n=Integer.MAX_VALUE;
	  
	  for(int i=0;i<n;i++){
		  int x=Integer.parseInt(sc.next());
		  int y=Integer.parseInt(sc.next());
		  if(x==0&&y==0){
			  break;
		  }
		  swap(x,y);
		  
	  }
    
  }
}