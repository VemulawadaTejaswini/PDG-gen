public Class Main { 
	public static void Main(String[] a) { 
      Scanner in = new Scanner(System.in);
      int k = in.nextInt();
      String s = in.next();
      result = "";
      if (s.length() > k)
        result = s.substring(0,k) + "...";
      else 
        result = s;
      System.out.println(result);
      
    }
}