import java.util.Scanner;
import java.text.DecimalFormat;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		for (int i = sc.nextInt(); i > 0; i--)
		{
			double x1 = sc.nextFloat();
			double y1 = sc.nextFloat();
			double x2 = sc.nextFloat();
			double y2 = sc.nextFloat();
			double x3 = sc.nextFloat();
			double y3 = sc.nextFloat();
		
			//(lhx, lhy)ツ湘」ツづ畦aツづ個陳シツ静シツ湘」
			double la;
			double lhx;
			double lhy;
			if (y1 != y2)
			{
				la = -1.0 * (x1 - x2) / (y1 - y2);
				lhx = (x1 + x2) / 2.0;
				lhy = (y1 + y2) / 2.0;
			}
			else
			{
				la = -1.0 * (x3 - x2) / (y3 - y2);
				lhx = (x3 + x2) / 2.0;
				lhy = (y3 + y2) / 2.0;
			}
			//(mhx, mhy)ツ湘」ツづ稽aツづ個陳シツ静シツ湘」
			double ma;
			double mhx;
			double mhy;
			if (y1 != y3)
			{
				ma = -1.0 * (x1 - x3) / (y1 - y3);
				mhx = (x1 + x3) / 2.0;
				mhy = (y1 + y3) / 2.0;
			}
			else
			{
				ma = -1.0 * (x3 - x2) / (y3 - y2);
				mhx = (x3 + x2) / 2.0;
				mhy = (y3 + y2) / 2.0;
			}
		
			double x = (lhy - mhy + ma * mhx - la * lhx) / (ma - la);
			double y = la * (x - lhx) + lhy;
		
		
			DecimalFormat df = new DecimalFormat();
			df.applyLocalizedPattern("0.000");
		
			System.out.print(df.format(x) + " " + df.format(y) + " ");
			System.out.println(df.format(Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1))));
		}
	}
}