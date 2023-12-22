class Main{
    public static void main(String[] a){
    	int total = 0;
    	for(int i = 1; i < 10; i++){
    		for(int j = 1; j < 10; j++){
    			total = i * j;
    			System.out.println(i + "x" + j + "=" + total);
    		}
    	}
    }
}