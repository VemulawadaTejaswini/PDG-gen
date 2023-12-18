import java.util.*;
 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int K = sc.nextInt();

        String D[] = new String [K];
        for (int i=0; i<D.length; i++) {
            D[i] = sc.next();
        }
 
        while (check(N, D)){
            Integer tmp = Integer.parseInt(N);
            tmp++;
            N = tmp.toString();
        }
        System.out.println(N);
    }
 
    private static boolean check(String str, String[] nums){
        for (int i=0; i<nums.length; i++){
            if(str.indexOf(nums[i])!=-1) return true;
        }
        return false;
    }
}