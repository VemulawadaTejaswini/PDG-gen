import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();

    long x = 800 * N;
    long y = 200 * (N / 15);
    System.out.println(x -y);
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
