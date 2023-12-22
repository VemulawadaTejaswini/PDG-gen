import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		String r,a;
		r=scan.next();
		a=scan.next();
		if(r.equals("0") && a.equals("0"))break;
		int hit=0,blow=0;
		for(int i=0;i<4;i++)
		    {
			if(r.charAt(i)==a.charAt(i))hit++;
			for(int j=0;j<3;j++)
			    {
				if((r.charAt(i)==a.charAt(j)) && (i!=j))blow++;
			    }
		    }
		System.out.println(hit+" "+blow);
	    }
    }
}