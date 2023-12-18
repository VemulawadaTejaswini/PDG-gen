public class Main {
  public void static main(String [] args) {
    char [] s = System.console().readLine().toCharArray();
    Arrays.sort(s);
    System.out.println(((s[0] == s[1]) && (s[1] != s[2]) && (s[2] == s[3])) ? "Yes" : "No");
  }
}