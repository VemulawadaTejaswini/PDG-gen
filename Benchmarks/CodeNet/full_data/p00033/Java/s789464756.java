import java.util.Scanner;

/**
 * Created by chinalife on 2019/7/24.
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        for(int i = 0;i < t;i++){
            String input = sc.nextLine();
            String[] intArr = input.split(" ");
            int[] inputInt = new int[intArr.length];
            for(int j = 0;j < intArr.length;j++){
                inputInt[j] = Integer.valueOf(intArr[j]);
            }
            boolean result = dfs(inputInt,0,0,0);
            if(result){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean dfs(int[] input,int i,int left,int right){
        if(i == 10){
            return true;
        }
        if(input[i] > left){
            boolean result = dfs(input,i+1,input[i],right);
            if(result){
                return result;
            }
        }
        if(input[i] > right){
            boolean result = dfs(input,i+1,left,input[i]);
            if(result){
                return result;
            }
        }
        return false;
    }

}
