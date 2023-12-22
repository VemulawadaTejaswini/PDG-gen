public class Main {
  
  static char[] arr = ("abcdefghijklmnopqrstuvwxyz").toCharArray(); 
  
  public static void main(String[] args){
    int N = new java.util.Scanner(System.in).nextInt();

    System.out.println(getName(N, ""));
  }
  
  private static String getName(int n, String str) {
    int syo = n / 26;
    int yo = n % 26;
    
    str = String.valueOf(arr[yo - 1]) + str;
    
    if (syo == 0) {
      return str;
    }
    return getName(syo, str);
  }
}