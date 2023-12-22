public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
	  System.out.println("please input the chang:");
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  int a = Integer.parseInt(reader.readLine()); 
	  System.out.println("please input the kuan:");
	  BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
	  int b = Integer.parseInt(reader2.readLine());
	  for(int i = 1;i<=b;i++) {
		  for(int j =1;j<=a;j++) {
		   if(i==1 || i == b) {
			  System.out.print("#");
		   }else if(j==1 || j == a) {
			   System.out.print("#");
		   }else {
			   System.out.print(" ");
		   }
		  }
		  System.out.println();
	  }
  }
}
