class Main
{
    public static void main(String args[])
    {
	int x,y,tmp;
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		x=scan.nextInt();
		y=scan.nextInt();
		if((x==0) && (y==0))break;
		if(x>y)
		    {
			tmp=x;
			x=y;
			y=tmp;
		    }
		System.out.println(x+" "+y);
	    }
    }
}