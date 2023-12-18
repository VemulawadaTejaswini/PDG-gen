public class Main
{
  public static void main(String[] args)
  {
    int input = new Scanner(System.in);
    int num = input.nextInt();
    int P =0;
    while(num>=500)
    {
      P+=1000;
      num-=500;
    }
    while(num>=5)
    {
      P+=5;
      num-=5;
    }
    system.out.println(P);
  }
}