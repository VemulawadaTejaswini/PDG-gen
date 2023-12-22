import java.util.Scanner;
public class Main{
    public static void main(String argv[])
    {
	Scanner scan = new Scanner(System.in);

	int num = scan.nextInt();
	int h=0,m=0,s=0;

	while(true)
	    {
		if( num - 3600 >= 0 )
		    {
			num = num-3600;
		    h++;
		    }
		else if( num - 60 >= 0 )
		    {
			num = num-60;
			m++;
		    }
		else {
		        if( num == 0) break;
			s++;
			num--;
		}
	    }
	System.out.println(h+":"+m+":"+s);

    }
}