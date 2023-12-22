class Main {
	public static void main(String[] args) {
      	java.util.Scanner input = new java.util.Scanner(System.in);
      	String S = input.nextLine();
      	String T = input.nextLine();
    	 new Main().solve(S, T);
    }
  	private void solve(String s, String t) {
      if(s.length() >= t.length())
        System.out.println("No");
    	 int low = 0;
       int high = s.length();
       while(low < high) {
        if(s.charAt(low) != t.charAt(low))
          System.out.println("No");
        low++;
       }
       System.out.println("Yes");
    }
}