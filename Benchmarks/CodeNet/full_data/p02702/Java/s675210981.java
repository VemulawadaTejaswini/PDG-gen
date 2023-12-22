public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    int result = 0;
    for (int i=0; i<s.length(); i++) {
      for (int j=i+1; j<=s.length(); j++) {
        String sb = s.substring(i, j);
        if (isMultiple(sb, 10, 2019)) result++;
      }
    }
    System.out.println(result);
  }
  static boolean isMultiple (String s, int base, int m) {
    int temp = 0;
    for (int i=0; i<s.length(); i++) {
      temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
    }
    if (temp==0) {return true;}
    return false;
  }
}
