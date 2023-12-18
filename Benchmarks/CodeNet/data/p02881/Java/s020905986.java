import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int target = scanner.nextInt();
    //    long start = System.currentTimeMillis(); 
        int ans = calc(target);
    //    long end = System.currentTimeMillis(); 
    //    long time = end - start;
        System.out.println(ans );
    //    System.out.println(time +"ms");
    }
    
    /**
     * @param target
     * @return
     */
    public static  int calc(int target){
        int divNum = 0;
        int ansNum = 0;
        int sumNum = 0;
        for (int i= 1; i + 1 <= target/2 ; i++)
        {
            if (target % i == 0)
            {
                divNum = i ;
                ansNum = target / i;
            }
            if ( divNum + ansNum < sumNum || sumNum == 0  )
            sumNum = divNum + ansNum ;
        }
        return sumNum -2;
    }
}