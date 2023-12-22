class Main{
    public static void main(String[] a){
		for(int i=0; i<9; i++) {
			int x = i+1;
			for(int j=0; j<9; j++) {
				int y = j+1;
				System.out.println( x + "x" + y + "=" + x*y);
			}
		}
    }
}