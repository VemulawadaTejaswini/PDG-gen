import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
        Integer[] arr = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
        Arrays.sort(arr , Comparator.reverseOrder());
        for(int i = 0;i < 3;i++)
               System.out.println(arr[i]);
 }
}