import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n=scanner.nextInt(),a[]=IntStream.concat(IntStream.of(0),IntStream.range(0,n).map(i->scanner.nextInt())).toArray();
        System.out.println(IntStream.range(0,n+1).peek(i->a[i]+=i==0?0:a[i-1]).mapToLong(i->IntStream.range(0,i).filter(j->a[i]==a[j]).count()).sum());
    }
}