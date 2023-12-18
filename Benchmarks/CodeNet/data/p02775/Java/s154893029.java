import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int len = n.length();

        String[] arr = new String[len];
        for (int i=0; i<len; i++) arr[i] = n.substring(i, i+1);

        long[] dpSum = new long[len];
//        long[] dpPay = new long[len];
//        long[] dpChange = new long[len];

        if (Integer.parseInt(arr[0])<=5){
            dpSum[0] = Integer.parseInt(arr[0]);
        }else if (6<=Integer.parseInt(arr[0])){
            dpSum[0] = 11 - Integer.parseInt(arr[0]);
        }

//        System.out.println(dpSum[0]);

        for (int i=1; i<len; i++){
            int tmp = Integer.parseInt(arr[i]);
            if (tmp<=5){
                dpSum[i] = dpSum[i-1]+tmp;
            }else if (6<=tmp){
                dpSum[i] = dpSum[i-1]+11 - Integer.parseInt(arr[i]);
            }
        }

        System.out.println(dpSum[len-1]);
    }
}
