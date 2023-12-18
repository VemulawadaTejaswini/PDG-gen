  public class Main {
      public static void main(String [] args) {
        char [] s = System.console().readLine().toCharArray();
        java.util.Arrays.sort(s);
        System.out.println(((s[0] == s[1]) && (s[1] != s[2]) && (s[2] == s[3])) ? "Yes" : "No");
      }
    }