Scanner scan = new Scanner(System.in);
		     int a = scan.nextInt();
		     int b = scan.nextInt();
		     int c = scan.nextInt();
		     int d = scan.nextInt();
		     int total = 0;
		     if(a <= b) {
		    	 total += a;
		     }else {
		    	 total += b;
		     }
		     if(c <= d) {
		    	 total += c;
		     }else {
		    	 total += d;
		     }
		     
		     System.out.println(total);