import java.util.*;

class Main
{
    public static void main(String args[])
    {
	int h,w;
	Scanner sc = new Scanner(System.in);

	while(true)
	    {
		h = sc.nextInt();
		w = sc.nextInt();
		if(h == 0 & w == 0) break;
		for(int i=0;i<h;i++)
		    {
			for(int j=0;j<w;j++)
			    {
				if(j==0 | j == w - 1 | i == 0 | i == h - 1)
				    {
					System.out.print("#");
				    }
				else
				    {
					System.out.print(".");
				    }
			    }
			System.out.println();
		    }
		System.out.println();
	    }
    }
}