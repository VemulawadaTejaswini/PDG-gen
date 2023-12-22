import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    int counter = 0;

    while (input.ready())
    {
      String[] inputStr = input.readLine().split(" ");
      final int FROM_YEAR = Integer.parseInt(inputStr[0]);
      final int TO_YEAR = Integer.parseInt(inputStr[1]);

      if (TO_YEAR == 0)
      {
        break;
      }

      if (counter > 0)
      {
        System.out.println();
      }
      counter++;

      ArrayList<Integer> ansList = leapYearCount(FROM_YEAR, TO_YEAR);

      if (ansList.size() == 0)
      {
        System.out.println("NA");
        continue;
      }

      for (Integer each : ansList)
      {
        System.out.println(each);
      }
    }

  }

  private static ArrayList<Integer> leapYearCount(int fromYear, int toYear)
  {
    ArrayList<Integer> yearList = new ArrayList<>();
    for (int i = fromYear; i <= toYear; i++)
    {
      if (isLeapYear(i))
      {
        yearList.add(i);
      }
    }
    return yearList;
  }

  private static boolean isLeapYear(int year)
  {
    if (year % 4 != 0)
    {
      return false;
    }

    if (year % 100 == 0)
    {
      if (year % 400 == 0)
      {
        return true;
      }
      return false;
    }
    return true;
  }
}