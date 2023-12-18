import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long target = scanner.nextLong();
    //    long start = System.currentTimeMillis(); 
        long ans = calc(target);
    //    long end = System.currentTimeMillis(); 
    //    long time = end - start;
        System.out.println(ans );
    //    System.out.println(time +"ms");
    }
    
    /**
     * @param target
     * @return
     */
    public static  long calc(long target){
        long divNum = 0;
        long ansNum = 0;
        long sumNum = 0;
        long count = 0;
        if (target % 2 != 0) {
            for (long i = 1; i < (target / 2) + 1 ; i++)
            {
                if (target % i == 0)
                {
                    divNum = i ;
                }
            }
            ansNum = target / divNum;
            sumNum = divNum + ansNum;
        } else {
            for (long j = 1; ansNum % 2 != 0 ; j++) {
                ansNum = target / 2;
                count = j;
            }
            ansNum = target / count;
            sumNum = ansNum + count;
        }
            if ( divNum + ansNum < sumNum || sumNum == 0  )
                sumNum = divNum + ansNum ;
        
        return sumNum -2;
    }
}