import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = Long.parseLong(sc.next());

        List<Long> runrun = new ArrayList<>();

        long num = 1;
        while(true){
            char[] arr = String.valueOf(num).toCharArray();
            int tmp = arr[0];
            boolean breaked = false;
            for(long l = 1; l<arr.length; l++){
                if(Math.abs(tmp, arr[i])>1){
                    breaked = true;
                    break;
                }
            }
            if(!breaked){
                runrun.add(num);
            }
            if(runrun.size() == k){
                System.out.println(runrun.get((int) (k-1)));
            }
        }
    }
}
