public class Main {
  
  public static void main(String[] args) {
    System.out.println(java.util.Arrays.stream(args).anyMatch(a -> a.equals("2")) ? "No" : "Yes");
  }
  
}