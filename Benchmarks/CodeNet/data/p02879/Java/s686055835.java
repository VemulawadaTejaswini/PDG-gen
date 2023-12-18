public class T{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextline();
    String[] data = str.split(" ");
    int[] score = new int[2];
    int[0] = Integer.parseInt(data[0]);
    int[1] = Integer.parseInt(data[1]);
    if (int[0] > 9 || int[1] >9){
      System.out.println(-1);
    }else{
      System,out.println(int[0] * int[1]);
    }
  }
}
    