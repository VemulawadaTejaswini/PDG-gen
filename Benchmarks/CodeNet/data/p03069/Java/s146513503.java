import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	sc.close();
	int bl =0; int wh =0;
	for(int i =0; i<n; i++) {
     if(s.charAt(i)=='.') {
    	 wh++;
     }
}
	int min = wh;
	for(int i =0; i<n; i++) {
	     if(s.charAt(i)=='#') {
	    	 bl++;
	     }
	     else {
	    	 wh--;
	     }
	     min = Math.min(min, wh+bl);
	}
	
  System.out.println(min);
    }

}
