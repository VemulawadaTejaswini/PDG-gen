import java.util.*;

public class Main {

	private static Scanner sc;
	static int i[];

	public static void main(String[] args) {
	   sc = new Scanner(System.in);
	   int x=1;
	   int y=1;
	   while(x!=0||y!=0){	
		    x=sc.nextInt();
		    y=sc.nextInt();
		   
		   int []i=new int[]{x,y};				   
		   Arrays.sort(i);
		   System.out.println(i[x]);
		   System.out.println(i[y]);

		    }
  }
	
}
    	