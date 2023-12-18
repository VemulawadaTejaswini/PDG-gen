class Main.java{
	public static void main(String[] args){
  if (N == M){
  System.out.println(N);
}
	if (N%M == 0){
  		System.out.println(-1);
	}
		else if(M%N == 0){
        	System.out.println(-1);
    	}		
			else if (N > M){
              int t;
				while ((N%M) != 0)
              	do{
              		t = N%M;
                  	N = M;
                  	M = t;
                } 
              	System.out.println(N*M/t);
        	}
				else (N < M){
                  while ((M%N) != 0)
              		do{
              			t = M%N;
                  		M = N;
                  		N = t;
                	} 
              	System.out.println(N*M/t);
                }
	}
}