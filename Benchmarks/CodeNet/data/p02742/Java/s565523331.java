public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	int h = itr.nextInt();
      	int w = itr.nextInt();
      	
 		int res = 0;
      	if (h % 2 == 1) 
        	res = h * w / 2 + 1;
        else
        	res = h * w / 2;
  		
  		System.out.println(res);
    }