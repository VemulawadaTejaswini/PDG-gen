public class Main
{

  public static void main
  (
    String[] args
  )
  {
    int park_time;
    int pay_per_use;
    int fix_price;
    int min_price;


    park_time   = Integer.parseInt(args[0]);
    pay_per_use = Integer.parseInt(args[1]);
    fix_price   = Integer.parseInt(args[2]);

    min_price = pay_per_use * park_time;

    if(fix_price < min_price)
    {
      min_price = fix_price;
    }

    System.out.println("" + min_price);
  }
}