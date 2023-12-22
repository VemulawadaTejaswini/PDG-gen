import java.util.*;

public class Main {

	private static Scanner sc;
	static int i[];

	public static void main(String[] args) {
	   sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   
	   while(x!=0||y!=0){
		   int []i=new int[]{x,y};				   
		   Arrays.sort(i);
		   System.out.println(i[x]);
		   System.out.println(i[y]);
		    }
  }
	
}
    	