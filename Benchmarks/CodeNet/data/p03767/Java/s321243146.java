import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String[] line = sc.nextLine().split(" ");

        int[] targetArr = new int[num * 3];

        for(int i = 0;i < line.length;i++){
            targetArr[i] = Integer.parseInt(line[i]);
        }

        Arrays.sort(targetArr);
        // for(int val : targetArr){
        //     System.out.println(val);
        // }

        long ans = 0;

        for(int i = num ;i < 2 * num;i++){
            ans += targetArr[i];
            // System.out.println(ans);
        }
        
        System.out.println(ans);

        sc.close();
    }
}