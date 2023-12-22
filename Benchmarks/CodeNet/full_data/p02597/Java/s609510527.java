import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        char[] C=new char[N];
            C=sc.next().toCharArray();
        int left=0;
        int right=N-1;
        int result=0;
        while(left<right){
            for(int i=left;i<=right;i++){
                left=i;
                if(C[i]!='R'){
                    break;
                }
            }
            for(int i=right;i>=left;i--){
                right=i;
                if(C[i]!='W'){
                    break;
                }
            }
            if(left>=right){
                break;
            }
            left++;
            right--;
            result++;
        }


        System.out.println(result);
    }
}