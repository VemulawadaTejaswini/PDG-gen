
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N= scanner.nextInt();
        int result=0;
        for(int i=0;i<N;i++){
            result+=func(scanner.nextInt());
        }
        System.out.println(result);
    }
    public static int func(int n){
        if(n%2!=0){
            return 0;
        }
        return func(n/2)+1;
    }
}
