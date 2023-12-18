import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();

    List<String> listA = new ArrayList<String>(Arrays.asList(S.split("")));
    List<String> listB = new ArrayList<String>(Arrays.asList(T.split("")));
    List<String> listC = new ArrayList<String>(new HashSet<>(listA));
    List<String> listD = new ArrayList<String>(new HashSet<>(listB));
    System.out.println((listC.size() == listD.size()) ? "Yes" : "No");
  }
}
