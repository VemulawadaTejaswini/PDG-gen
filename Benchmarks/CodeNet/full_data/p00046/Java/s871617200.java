public class Differential {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Double> hList = new ArrayList<Double>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			double h = Double.parseDouble(br.readLine());
			hList.add(h);
		}
		Collections.sort(hList);
		double hMin = (Double) hList.get(0);
		double hMax = (Double) hList.get(hList.size() - 1);
		
		System.out.println(hMax - hMin);
	}
}