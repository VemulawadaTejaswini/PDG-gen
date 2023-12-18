import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    if(N % K  == 0)
        System.out.println(0);
    else
        System.out.println(1);
    }










    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }
}
