
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str ;
    int[] a = new int[128];
    int i; 
    while(sc.hasNext()){
      str = sc.nextLine().toLowerCase();
    for(i=0;i<str.length();i++){
      a[str.charAt(i)]++;;
    }
    }
    for(char ch='a';ch<='z';ch++){
      System.out.println(ch+" : "+a[ch]);
    }
    sc.close();
    
  }
}

