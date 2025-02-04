class Main{

	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		double degree = Double.parseDouble(str[2]);

		double revrad = 3.1415926d * ( (180-degree)/180);

		double cx = b * Math.cos(revrad) + a;
		double cy = b * Math.sin(revrad);

		System.out.printf("%.5f\n",(a*cy) / 2);
		System.out.printf("%.5f\n",Math.sqrt( (Math.pow(cx, 2) + Math.pow(cy, 2) )  ) + a + b);
		System.out.printf("%.5f\n",cy);
	}
}