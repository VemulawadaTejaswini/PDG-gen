import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] nums=new char[n];
        String str=sc.next();
        for(int i=0;i<n;i++){
            nums[i]=str.charAt(i);
        }
        Arrays.sort(nums);
        int tmp=1;
        long output=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                tmp++;
                if(i==n-1){
                    output*=tmp+1;
                }
            }else{
                output*=tmp+1;
                tmp=1;
                if(i==n-1){
                    output*=tmp+1;
                }
            }
            
        }
        System.out.println(output-1);

    }

}