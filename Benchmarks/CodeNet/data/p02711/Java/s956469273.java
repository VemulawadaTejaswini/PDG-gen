import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String str = reader.readLine();
  
  if (str.contains("7")) {
  	System.out.println("Yes");
  } else {
  	System.out.println("No");
  }
}