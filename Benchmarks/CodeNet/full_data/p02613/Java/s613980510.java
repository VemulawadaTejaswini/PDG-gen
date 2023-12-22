import java.util.Scanner;
import java.util.*;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  Integer testCase = sc.nextInt();
  List<String> vA = new ArrayList < String > ();
  for (int i = 0; i < testCase; i++)
   vA.add(sc.next());

  Integer ac = 0;
  Integer wa = 0;
  Integer tle = 0;
  Integer re = 0;


  for (String v: vA) {

   switch (v) {
    case "AC":
     ac++;
     break;
    case "WA":
     wa++;
     break;
    case "TLE":
     tle++;
     break;
    case "RE":
     re++;
     break;
   }
  
  }
   
   System.out.println(String.format("AC x %s \nWA x %s \nTLE x %s \nRE x %s ",ac,wa,tle,re));
 }

}