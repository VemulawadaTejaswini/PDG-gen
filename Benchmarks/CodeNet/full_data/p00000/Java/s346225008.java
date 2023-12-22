class Main{
    public static void main(String[] a){
    	
    	int[] x = new int[9];
    	
    	for(int i = 0;i < 9;i++) {
    		x[i] = i + 1;
    	}
    	
    	for(int X1 : x) {
    		for(int X2 : x) {
    			System.out.println(X1+"x"+X2+"="+X1*X2);
    		}
    	}
    }
}
