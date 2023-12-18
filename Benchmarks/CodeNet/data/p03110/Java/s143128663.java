public class Main{
  public static void main(String args[]) {
    int n = args[0];
    int b = 380000;
    double d=0;
    for(int i=1;i<n;i++) {
      String[] s=args[i].split(" ");
      if(s[1].equals("JPY")) {
        d+=Integer.parseInt(s[0]);
      }
      else{
        d+=Double.parseDouble(s[0])*b;
      }
    }
    System.out.println(d);
  }
}