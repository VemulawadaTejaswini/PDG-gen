import java.util.*;
public class Main {
   
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);


         String rslt = "";
        for(int i = 0; i < arr.length; i++) {
            rslt += arr[i];
        } 
        System.out.println(rslt);
    }
}	