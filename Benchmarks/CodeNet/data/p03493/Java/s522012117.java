import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    InputStreamReader in = new InputStreamReader(System.in);
    int ans = 0;
    for (int i = 0; i < 3; i++){
      ans += Integer.parseInt(in.read());
    }
    System.out.println(ans);
  }
}
