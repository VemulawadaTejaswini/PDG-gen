    import java.util.Scanner;
    public class Main{
  public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
          int num1 = scan.nextInt();
          int num2 = scan.nextInt();
          int num3 = scan.nextInt();
          if(num1<num2&&num2<num3){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
          scan.close();
}
}

