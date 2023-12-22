import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> inputList = new ArrayList<>();

    while (input.ready())
    {
      inputList.add(input.readLine());
    }
    final String ans = sover(inputList);
    System.out.println(ans);

  }

  private static String sover(ArrayList<String> inputList)
  {
    ThreeCupSet cupset = new ThreeCupSet();

    for (String each : inputList)
    {
      String[] cups = each.split(",");
      cupset.replace(cups[0], cups[1]);
    }
    return cupset.inBallCup();

  }

  static class ThreeCupSet
  {
    private boolean[] cupSet = new boolean[3];

    public ThreeCupSet()
    {
      Arrays.fill(this.cupSet, false);
      this.cupSet[0] = true;
    }

    private int getIndex(String str)
    {
      switch (str)
      {
      case "A":
        return 0;
      case "B":
        return 1;
      case "C":
        return 2;
      default:
        return -1;
      }
    }

    private String getCupName(int index)
    {
      switch (index)
      {
      case 0:
        return "A";
      case 1:
        return "B";
      case 2:
        return "C";
      default:
        return "";
      }
    }

    public void replace(String cup1, String cup2)
    {
      final boolean tmp1 = this.cupSet[getIndex(cup1)];
      final boolean tmp2 = this.cupSet[getIndex(cup2)];
      this.cupSet[getIndex(cup2)] = tmp1;
      this.cupSet[getIndex(cup1)] = tmp2;
    }

    public String inBallCup()
    {
      for (int i = 0; i < cupSet.length; i++)
      {
        if (cupSet[i])
        {
          return getCupName(i);
        }
      }
      return "";
    }
  }
}