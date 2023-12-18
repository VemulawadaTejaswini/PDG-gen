
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static int queryCount=0;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ints=new int[n];
        int[] howMany=new int[n];
        for(int i=0;i<n;i++){
            ints[i]=scanner.nextInt();
            howMany[i]=howManyCanDiv2(ints[i]);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min>howMany[i])min=howMany[i];
        }
        System.out.println(min);
    }
    public static int howManyCanDiv2(int n){
        int result=0;
        while(n%2==0){
            result++;
            n=n/2;
        }
        return result;
    }
}
