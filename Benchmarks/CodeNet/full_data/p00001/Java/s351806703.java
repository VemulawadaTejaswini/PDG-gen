public class Main {
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		List<String> list = new ArrayList<String>();
		
		while((line=br.readLine()) != null){
			
			list.add(line);
		
		}

		Collections.sort(list);

	}

}