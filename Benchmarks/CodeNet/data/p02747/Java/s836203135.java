public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int i = 0;
    int x = 0;
    String str = scan.next();
    if(str.contains("hi")){
      i = 1;
    }
    if(i == 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}