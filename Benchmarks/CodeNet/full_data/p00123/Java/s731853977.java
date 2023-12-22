ublic class Main {
	double[] grade_500 = {35.5, 37.5, 40.0, 43.0, 50.0, 55.0, 70.0};
	double[] grade_1000 = {71.0, 77.0, 83.0, 89.0, 105.0, 116.0, 148.0};
	String[] grade = {"AAA", "AA", "A", "B", "C", "D", "E"};
	public void solve() throws IOException{
		while( stdIn.hasNext() ){
			double x = stdIn.nextDouble();
			double y = stdIn.nextDouble();
			int g1 = 7; int g2 = 7;
			for(int i = 0; i < 7; i++){
				if( x < grade_500[i] ){
					g1 = i;
					break;
				}
			}
			for(int i = 0; i < 7; i++){
				if( y < grade_1000[i] ){
					g2 = i;
					break;
				}
			}
			int index = Math.max(g1, g2);
			if( index == 7 ){
				writer.println("NA");
			} else {
				writer.println(grade[index]);
			}
			writer.flush();			
		}
	//	writer.flush();
	} 
			
	public static void main (String args[]) throws IOException {
		new Main().run();
	}
	Scanner stdIn;
	PrintWriter writer;
	
	public void run() throws IOException{
		stdIn = null;
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			writer = new PrintWriter(System.out);
			solve();
			stdIn.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
}