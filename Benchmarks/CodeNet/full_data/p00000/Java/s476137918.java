class Main{
    
      public static void main(String [] srgs){
		
		int i,j,k;
		for(i=1; i<10;i++){
			for(j=0;j<10;j++){
				k = i * j ;
				System.out.print(i + "x" + j +"=" + k);
				System.out.print("\t");
				k = 0;
			}
			System.out.print("\n");
		}
		
	}
}