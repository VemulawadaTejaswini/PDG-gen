class Main{
    public static void main(String[] a){
         int i,j,k;
		for(i=1; i<10;i++){
			for(j=0;j<10;j++){
				k = i * j ;
				System.out.println(i + "x" + j +"=" + k);
				k = 0;
			}
		}
    }
}