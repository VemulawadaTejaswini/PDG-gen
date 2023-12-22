public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String othello;
    char[] field;
    int i;

    othello = sc.next();
    field = new char[othello.length()];
    for(i = 0;i < field.length;i++){
      field[i] = othello.charAt(i);
    }

    if(field[0] == 'x' && field[field.length - 1] == 'x'){
      System.out.println("x");
    }else{
      System.out.println("o");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}