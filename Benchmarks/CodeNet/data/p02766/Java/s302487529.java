import java.util.*;
import java.io.*;
import java.math.BigInteger;
	
class Main {
	static String ReadLn (int maxLg) {
    byte lin[] = new byte [maxLg];
    int lg = 0, car = -1;
    String line = "";
    try {
      while (lg < maxLg) {
        car = System.in.read();
        if ((car < 0) || (car == '\n')) break;
        lin[lg++] += car;
      }
    }
    catch (IOException e) {
      return (null);
    }
    if ((car < 0) && (lg == 0)) 
    	return (null);
    return (new String (lin, 0, lg));
  }
	
	public static void main (String args[]) {
		Main myWork = new Main();
      myWork.Process();
  }
	
	void Process() {
		String input, s1, s2;
		BigInteger a, x;
		int b;
    StringTokenizer line;
    while ((input = Main.ReadLn(255)) != null) {
    	line = new StringTokenizer (input);
    	s1 = line.nextToken();
    	s2 = line.nextToken();
    	a = new BigInteger(s1);
    	b = Integer.parseInt(s2);
    	System.out.println(a.toString(b).length());
    }
	}
}
