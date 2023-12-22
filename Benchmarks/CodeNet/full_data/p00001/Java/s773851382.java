public class Main{
	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("test.txt");
	    BufferedReader br = new BufferedReader(in);
	    ArrayList<Integer> Al = new ArrayList<Integer>();
	    
		// Read in
	    String line = br.readLine();
	    while (line != null) { // You might also want to check for empty?
	        Al.add(Integer.valueOf(line));
	        line = br.readLine();
	    }
	    
		// Quick Sort
	    Collections.sort(Al);
	    
		// Print first 3
	    Integer i = Al.size() - 1;
	    Integer numOfElements = 3;
	    while (i >= Al.size()-numOfElements){
	    	System.out.println(Al.get(i));
	    	i--;
	    }
	}
}