class Main {
	public static void main(String[] args) {
      	java.util.Scanner input = new java.util.Scanner(System.in);
      	String S = input.nextLine();
      	String T = input.nextLine();
    	 new Main().solve(S, T);
    }
  	private void solve(String s, String t) {
      if(s.length() >= t.length())
        System.out.print("No");
    	 if(s.equals(t.substring(0, s.length())))
          System.out.print("Yes");
        else
          System.out.print("No");
    }
}