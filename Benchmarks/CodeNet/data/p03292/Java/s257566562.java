import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] aa = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
        
        Arrays.sort(aa);
        System.out.print((aa[2] - aa[1]) + (aa[1] - aa[0]));
    }
}
