import java.util.*;

class Main{
	static int x;
	static int y;
	private static Scanner sc;
	public static void main(String[]agrs){
		sc = new Scanner(System.in);
	    x=sc.nextInt();
		y=sc.nextInt();
		if(x!=0||y!=0){
		int []i =new int[]{x,y};
		Arrays.sort(i);
		System.out.print(i[0]+" "+i[1]);
		System.out.println();
		 x=sc.nextInt();
	     y=sc.nextInt();
		}
		
		
		
	}
}