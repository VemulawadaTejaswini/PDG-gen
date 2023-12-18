import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] nums=new int[4][n];
        String tmp=sc.next();
        int count=0;
        for(int i=0;i<n;i++){
            nums[0][i]=tmp.charAt(i)-48;
        }
        nums[1][0]=nums[0][0];
        count=1;
        for(int i=1;i<n;i++){
            if(nums[0][i-1]!=nums[0][i]){
                nums[1][count]=nums[0][i];
                count++;
            }
        }
        if(count==2){
            System.out.println(Math.abs(nums[1][1]-nums[1][0]));
            return;
        }
        int counttmp=count;
        for(int i=0;i<counttmp-1;i++){
            nums[2][i]=Math.abs(nums[1][i+1]-nums[1][i]);
        }
        nums[3][0]=nums[2][0];
        count=1;
        for(int i=1;i<counttmp-2;i++){
            if(nums[2][i-1]!=nums[2][i]){
                nums[3][count]=nums[2][i];
                count++;
            }
        }
        if(count==1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }

}