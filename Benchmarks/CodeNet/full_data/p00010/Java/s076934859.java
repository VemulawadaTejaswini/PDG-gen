class Main
{
	double x, y;
	Main( double x, double y )
	{
		this.x = x;
		this.y = y;
	}
	public static void main( String[] args )
	{
		new Circle();
	}
	static class Circle
	{
		Circle()
		{
			java.util.Scanner sc = new java.util.Scanner( System.in );
			point a = new point( sc.nextDouble(), sc.nextDouble() );
			point b = new point( sc.nextDouble(), sc.nextDouble() );
			point c = new point( sc.nextDouble(), sc.nextDouble() );
			
			double ax_2 = a.x*a.x;
			double ay_2 = a.y*a.y;
			double bx_2 = b.x*b.x;
			double by_2 = b.y*b.y;
			double cx_2 = c.x*c.x;
			double cy_2 = c.y*c.y;
			double p1 = (a.y - c.y)*(ay_2 - by_2 + ax_2 - bx_2)+(a.y - b.y)*(ay_2 - cy_2 + ax_2 - cx_2);
			double p2 = 2*(a.y - c.y)*(a.x - b.x)-2*(a.y - b.y)*(a.x - c.x);
			double q1 = (a.x - c.x)*(ax_2 - bx_2 + ay_2 - by_2)-(a.x - b.x)*(ax_2 - cx_2 + ay_2 - cy_2);
			double q2 = 2*(a.x - c.x)*(a.y - b.y)-2*(a.x - b.x)*(a.y - c.y);
			
			double p = (p1/p2)/0.001/1000;
			double q = (q1/q2)/0.001/1000;
			double d = Math.sqrt((p-a.x)*(p-a.x)+(q-a.y)*(q-a.y));
			
			System.out.printf( "%.3f %.3f %.3f\n" , p, q, d );
		}
	}
}