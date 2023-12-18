package wolkOnMultiplicationTable;


/**
 * @author yoshizaki
 *
 */
public class walkOn {

public static void main(String[] args) {
    long start = System.currentTimeMillis(); 
    int ans = calc(Integer.parseInt(args[0]));
    long end = System.currentTimeMillis(); 
    long time = end - start;
    System.out.println(ans + "回");
    System.out.println(time +"ms");
}

public static  int calc(int target){
    int divNum = 0;
    int ansNum = 0;
    int sumNum = 0;
    for (int i= 1; i <= target/2 ; i++) {
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
