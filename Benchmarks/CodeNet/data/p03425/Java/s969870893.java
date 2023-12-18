

import java.io.*;
import java.util.*;

public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String march = "MARCH";
    TreeMap<Character,Integer> mp = new TreeMap<Character, Integer>();
    for(int i = 0; i<5; i++){
      mp.put(march.charAt(i), 0); 
    }
    for(int i = 1; i<=N; i++){
      String s = sc.next();
      mp.put(s.charAt(0), mp.containsKey(s.charAt(0)) ? mp.get(s.charAt(0))+1 : 1);
    }
    long ans = 0;
    for(int i = 0; i<5; i++){
      for(int j = i+1; j<5; j++){
        for(int k = j+1; k<5; k++){
            ans += 1L * mp.get(march.charAt(i)) * mp.get(march.charAt(j)) * mp.get(march.charAt(k));
        }
      }
    }
    System.out.println(ans);
  }
}
