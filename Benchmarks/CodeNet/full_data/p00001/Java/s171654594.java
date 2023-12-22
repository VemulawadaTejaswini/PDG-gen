class Main{
    public static void main(String[] a){
        for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				int height1 = Integer.parseInt(a[i]);
				int height2 = Integer.parseInt(a[j]);
				if(height1>height2) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		
		for(int i=0;i<3;i++)
			System.out.println(a[i]+"\n");
    }
	
    
}