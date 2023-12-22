class Main{
    public static void main(String[] args){
        int[][] a = new int[9][9];
	int multi;
	for(int i=0; i<9; i++){
	    for(int j=0; j<9; j++){
		multi = (i+1)*(j+1);
		System.out.println((i+1)+"×"+(j+1)+"="+multi);
	    }
	}
    }
}