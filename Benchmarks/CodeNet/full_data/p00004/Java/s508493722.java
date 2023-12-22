		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			// ax + by = c
			double a = in.nextDouble();
			double b = in.nextDouble();
			double c = in.nextDouble();
			// dx + ey = f
			double d = in.nextDouble();
			double e = in.nextDouble();
			double f = in.nextDouble();
			
			double y = (f + (-1 * d * (c / a))) / ((-1 * (d / a) * b) + e);
			double x = (f + (-1 * e * y)) / d;
		
			if(x == -0.000 || x == +0.000) {
				x = 0.000;
			}
			if(y == -0.000 || y == +0.000) {
				y = 0.000;
			}
			
			System.out.println(String.format("%.3f %.3f", x, y));
		}