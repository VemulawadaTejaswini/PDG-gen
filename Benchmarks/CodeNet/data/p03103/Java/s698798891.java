import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[][] nums=new long[n][2];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
        nums=sort(nums);
        long output=0;
        long tmp;
        for(int i=0;i<n;i++){
            tmp=Math.min(nums[i][1],m);
            m-=tmp;
            output+=nums[i][0]*tmp;
            if(m==0)break;
            
        }
        System.out.println(output);

    }
    static long[][] sort(long[][] input){
        long[] tmp;
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length-1;j++){
                if(input[j][0]>input[j+1][0]){
                    tmp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=tmp;
                }
            }
        }
        return input;
    }

}
