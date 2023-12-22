import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int before = scan.nextInt();
    int after = scan.nextInt();
    int sum = scan.nextInt();

    while(!(before==0&&after==0&&sum==0)) {
      int max = -1;
      for(int i = 1; i < sum; i++) {
        for(int j = 1; j < sum; j++) {
          int addTaxA = addTax(i,before);
          int addTaxB = addTax(j,before);
          if(sum==addTaxA+addTaxB) {
            int result = addTax(i,after) + addTax(j,after);
            if(max<result) {
              max = result;
            }
            break;
          }
        }
      }

      System.out.println(max);

      before = scan.nextInt();
      after = scan.nextInt();
      sum = scan.nextInt();
    }
  }

  public static int addTax(int _x, int _tax) {
      return (int)Math.floor(_x*(100.0+_tax)/100.0);
  }
}