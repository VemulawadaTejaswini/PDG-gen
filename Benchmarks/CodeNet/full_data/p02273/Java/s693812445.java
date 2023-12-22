import java.util.*;

class Main
{
    //This class has a date of koch
    static class Koch
    {
	private double x=0;
	private double y=0;

	//set method
	void setPoint(double x, double y)
	{
	    this.x=x;
	    this.y=y;
	}


	//division point methods
	void divisionPoint1(Koch k1, Koch k2)
	{
	    double x = (k2.getX() - k1.getX())/3;
	    double y = (k2.getY() - k1.getY())/3;
	    this.setPoint(x+k1.getX(), y+k1.getY());
	    //System.out.println("aa"+ x+k1.getX()+"   "+y+k1.getY());
	}

	void divisionPoint2(Koch k1, Koch k2)
	{
	    double x = (k2.getX() - k1.getX())/3;
	    double y = (k2.getY() - k1.getY())/3;
	    this.setPoint(2*x+k1.getX(), 2*y+k1.getY());
	    //System.out.println("aa"+ 2*x+k1.getX()+"   "+2*y+k1.getY() );
	}

	//get New Point
	void getKoch(Koch k1, Koch k2)
	{
	    double x = k2.getX() - k1.getX();
	    double y = k2.getY() - k1.getY();

	    if(k1.getY()<k2.getY())
		{
		    this.x = (Math.cos(Math.PI/3)*x - Math.sin(Math.PI/3)*y)+k1.x;
		    this.y = (Math.sin(Math.PI/3)*x + Math.cos(Math.PI/3)*y)+k1.y;
		}
	    else 
		{
		    this.x = (Math.cos(-1*Math.PI/3)*x - Math.sin(-1*Math.PI/3)*y)+k1.x;
		    this.y = (Math.sin(-1*Math.PI/3)*x + Math.cos(-1*Math.PI/3)*y)+k1.y;
		}

	}

	//gets methods
	double getLength()
	{
	    double length = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	    return length;
	}

	double getX()
	{
	    return x;
	}

	double getY()
	{
	    return y;
	}
    }


    //Main method
    public static void main(String[] args)
    {
	int n;
	Scanner read = new Scanner(System.in);
	int i, j, k;

	Koch[] koch = new Koch[100000];
	double[] kochLength = new double[100000];
	double m;
	int length;
	Koch yobi = new Koch();

	//Inirilization
	for(i=0; i<100000; i++)koch[i] = new Koch();

	//read n
	n = read.nextInt();
	read.close();

	//Make Koch
	koch[0].setPoint(0.0, 0.0);
	koch[1].setPoint(100.0, 0.0);
	kochLength[0]=0;
	kochLength[1]=100;
	length=2;

	for(i=0; i<n; i++)
	    {
		//division point
		k=length-1;
		for(j=0; j<k; j++)
		    {
			koch[length].divisionPoint1(koch[j], koch[j+1]);
			kochLength[length]=koch[length].getLength();
			length++;
			koch[length].divisionPoint2(koch[j], koch[j+1]);
			kochLength[length]=koch[length].getLength();
			length++;

			//get koch
			koch[length].getKoch(koch[length-2], koch[length-1]);
			kochLength[length]=koch[length].getLength();
			length++;
		    }

		//Sort
		for(j=0; j<length; j++)
		    {
			for(k=0; k<length; k++)
			    {
				if(kochLength[j]<kochLength[k])
				    {
					yobi.setPoint(koch[j].getX(), koch[j].getY());
					koch[j].setPoint(koch[k].getX(), koch[k].getY());
					koch[k].setPoint(yobi.getX(), yobi.getY());

					m=kochLength[j];
					kochLength[j]=kochLength[k];
					kochLength[k]=m;
				    }
			    }
		    }


		//get koch
		/*
		k=length-1;
		for(j=0; j<k; j++)
		    {
			koch[length].getKoch(koch[j], koch[j+1]);
			kochLength[length]=koch[length].getLength();
			length++;
		    }

		//Sort
		for(j=0; j<length; j++)
		    {
			for(k=0; k<length; k++)
			    {
				if(kochLength[j]<kochLength[k])
				    {
					yobi.setPoint(koch[j].getX(), koch[j].getY());
					koch[j].setPoint(koch[k].getX(), koch[k].getY());
					koch[k].setPoint(yobi.getX(), yobi.getY());

					m=kochLength[j];
					kochLength[j]=kochLength[k];
					kochLength[k]=m;
				    }
			    }
		    }
		*/

	    }

	for(i=0; i<length; i++)
	    {
		System.out.printf("%.8f %.8f\n", Math.abs(koch[i].getX()), Math.abs(koch[i].getY()));
	    }
    }
}