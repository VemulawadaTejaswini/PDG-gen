
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static int next(List<Integer> arr, int target)
    {
        int start = 0, end = arr.size() - 1;

        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Move to right side if target is
            // greater.
            if (arr.get(mid) <= target) {
                start = mid + 1;
            }

            // Move left side.
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList<Integer>(Arrays.asList(0,1, 2, 3, 4, 5, 6,7,8,9));
        List<Integer> excNumbers = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int n, k;
        n = in.nextInt();
        k = in.nextInt();
        in.nextLine();
        for (int i = 0; i< k ; i++){
            excNumbers.add(in.nextInt());
        }
        List<Integer> myNumbers = new ArrayList<Integer> ();
        myNumbers.addAll(allNumbers);
        myNumbers.removeAll(excNumbers);
//        System.out.println(allNumbers);
//        System.out.println(excNumbers);
//        System.out.println(myNumbers);
        String n1 = Integer.toString(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i< n1.length() ; i++){
            int number = Integer.parseInt(String.valueOf(n1.charAt(i)));
            if(number == 9 && excNumbers.contains(number) && i == 0){
                if(myNumbers.get(0) == 0){
                    result.append ((char)(myNumbers.get(1) + '0'));
                    result.append( '0');
                }else{
                    result.append((char)(myNumbers.get(0) + '0'));
                    result.append((char)(myNumbers.get(0) + '0'));
                }

            }
            else if (number == 9 && excNumbers.contains(number) && i != 0){
                result.append((char)(myNumbers.get(0) + '0'));
                int number1 = Integer.parseInt(String.valueOf(n1.charAt(i-1)));
                if(!excNumbers.contains(number1)){
                    int x = next(myNumbers,number1);
                    result.setCharAt(i-1,(char)(myNumbers.get(x) + '0'));
                }
            }
           else if(excNumbers.contains(number)){
                int x = next(myNumbers,number);
                result.append((char)(myNumbers.get(x) + '0'));
            }
            else
           {
               result.append(n1.charAt(i));
               }
        }

        System.out.println(Integer.parseInt(result.toString()));
    }
}