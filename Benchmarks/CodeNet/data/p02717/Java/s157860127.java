public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int x = key.nextInt();
        int y = key.nextInt();
        int z = key.nextInt();
        int temp = 0;
        
        temp = x;
        x = y;
        y = temp;
        temp = x;
        x = z;
        z = temp;

        System.out.println(x+" " + y + " "+ z);
    }
}