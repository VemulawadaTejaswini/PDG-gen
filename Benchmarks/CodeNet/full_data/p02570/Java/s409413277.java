import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
  	Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();
    
    // float tdash = d/s;

    float sdash = d/t;

    if (sdash < s)
        System.out.println("No");
    else
        System.out.println("Yes");

    // if (tdash > t)
    //     System.out.println("No");
    // else
    //     System.out.println("Yes");
  }

}