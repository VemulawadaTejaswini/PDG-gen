public class Main {
	public static void main(String args[]) throws IOException{
		double n = 0;
		double m = 0;
		double sigma = 0;
		double alpha =0;
		ArrayList<Double> s = new ArrayList<Double>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			n = Double.parseDouble(br.readLine());
			if(n == 0){
				break;
			}
			
			String str[] = br.readLine().split(" ");
			for(int i=0; i<str.length; i++){
				s.add(Double.parseDouble(str[i]));
			}
			
			
			m = ave(s,n);
			
			for(int i=0; i<s.size(); i++){
				sigma += (s.get(i) - m) * (s.get(i) - m);
			}
			
			alpha = Math.sqrt(sigma / n);
			System.out.println(alpha);
		}
	}
	
	public static double ave (ArrayList<Double> s, double n){
		double sum =0;
		
		for(int i=0; i<s.size(); i++){
			sum += s.get(i);
		}
		
		return (sum / n);
	}
}