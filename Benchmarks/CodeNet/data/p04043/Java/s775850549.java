import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static int digitCount(int nYen)
    {
        int counter = 0;
        while(nYen >= 10)
        {
            nYen /= 10;
            counter++;
        }
        return counter;
    }

    public static void Solver(int nYen,int numberOfDislikesNumber,int[] dislikedNumber)
    {
        ArrayList<Integer> likedNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int counter = 0;
            for (int j = 0; j < dislikedNumber.length; j++) {
                if(i == dislikedNumber[j])
                    counter++;
            }
            if(counter == 0)
                likedNumber.add(i);
        }
        System.out.println(likedNumber);

        int firstDigit =(int) (nYen / Math.pow(10,digitCount(nYen)));
        System.out.println(firstDigit);

        int sum = 0;
        Collections.sort(likedNumber);
        int money = 0;
        for (int i = 0; i < likedNumber.size(); i++) {
            if(nYen/Math.pow(10,i) <= (likedNumber.get(i)) * Math.pow(10,digitCount(nYen-i)))
            {
                money =(int) (likedNumber.get(i) * Math.pow(10,digitCount(nYen)-i));
                sum += money;
                if(i == likedNumber.size() -1)
                {
                    sum *= 10;
                    sum += likedNumber.get(i-1);
                }
            }

        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dis = {1,2,5,8};
        Solver(500,4,dis);
    }
}
