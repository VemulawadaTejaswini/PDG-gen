class Main{
    public static void main(String[] a){
    	Main app = new Main();
    	app.calculation();
    }
    
    public void calculation(){
    	int i,j;
    
    	for(i=1;i<=9;i++){
    		for(j=1;j<=9;j++){
    			System.out.println(i +"×"+ j +"="+ i*j);
    		}
    	}
    }
}