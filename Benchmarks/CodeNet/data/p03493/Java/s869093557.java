    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
    	String a = sc.next();
    	int count = 0;
    	for(char x:a.toCharArray()){
    		if(x=='1'){
    			count += 1;
    		}
    	}
    	System.out.println(count);
    }