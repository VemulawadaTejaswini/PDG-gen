import java.util.*;
import java.io.*;
 
class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
      String weather = sc.next();
      if(weather == "Sunny") {
        out.println("Cloud");
      }
      if(weather == "Cloud") {
        out.println("Rainny");
      }
      if(weather == "Rainny") {
        out.println("Sunny");
      }
    }
}