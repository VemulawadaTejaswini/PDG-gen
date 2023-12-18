public class Main {
	public static void main(int a, int b){
		int c = a*b;
      	String result = "";
        if (c % 2 == 0) {
          result = "Even";
        } else {
		  result = "Odd";
        }
        System.out.println(result);
	}
}