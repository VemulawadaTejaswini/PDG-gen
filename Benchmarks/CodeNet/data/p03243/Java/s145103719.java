import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String[] strArray = N.split("");
		
      	int max = 0;
		for (int i = 0; i < strArray.length; i++) {
          int v = Integer.parseInt(strArray[i]);
          if (v > max) {
              max = v;
          }
        }
     System.out.println(max + "" + max + "" + max);
    }
}