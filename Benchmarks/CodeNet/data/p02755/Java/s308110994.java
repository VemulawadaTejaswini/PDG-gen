import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int x = (int)(a/0.08);
      	int ax= (int)(x*0.08);
      	int ax2 = (int)((x+1)*0.08);
      	int y = (int)(b/0.08);
      	int by = (int)(y*0.08);
      	int by2 = (int)((y+1)*0.08);
      	int check = 0;
      	if(ax!=a && ax2!=a) check=1;
      	if(by!=b && by2!=b) check=1;
      	if(check==1) System.out.println("-1");
      	else if(x==y)System.out.println(x);
        else System.out.println("-1");
	}
}
