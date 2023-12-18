import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=0;
        int[] tmp=new int[3];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<3;j++){
                tmp[j]=nums[i+j];
            }
            Arrays.sort(tmp);
            if(tmp[1]==nums[i+1]){
                ans++;
            }
        }
        System.out.println(ans);
    }

}