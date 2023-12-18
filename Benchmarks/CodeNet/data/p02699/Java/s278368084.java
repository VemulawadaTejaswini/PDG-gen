public class Main {
  public static void main(String.. args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    br.close();
    
    if (b >= a)
      System.out.println("unsafe");
    else 
		System.out.println("safe");
  }
}