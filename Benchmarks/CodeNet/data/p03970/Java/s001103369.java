public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);

	    String s = "CODEFESTIVAL2016";
        String tmp = in.nextLine();
        
        int ans =0;
        for(int i=0;i<s.length();i++)
        	if(tmp.charAt(i)!=s.charAt(i))
        		ans++;
        
        System.out.print(ans);
	        

	}

}