import java.util.*;
public class Main
{
	public  static  void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int yen=s.nextInt();
		int hap=0;
		while(yen>=5)
		{
			if(yen>=500)
			{
				yen=yen-500;
				hap=hap+1000;
			}
			if(yen<500 && yen>=5)
			{
				yen=yen-5;
				hap=hap+5;
			}
		}
		System.out.print(hap);
	}
}