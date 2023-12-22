import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] agrs){
	  System.out.println("求めたいの円の半径を入力してください：(cm)");
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	    	String r = reader.readLine();
	    	int R = Integer.parseInt(r);
	    	double S =(Math.PI) * R * R;
	    	double D =(Math.PI) * R;
	    	System.out.println("円の面積は："+ (S) + "Cm~2");
	    	System.out.println("円の円周は:"+ (D) + "Cm");
	    	
	    }catch(IOException e) {
	    	 System.out.println(e);
	     }catch(NumberFormatException e) {
	    	 System.out.println("you input wrong number.");
	  
	  
  }
}
}

