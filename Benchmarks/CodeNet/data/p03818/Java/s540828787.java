import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[100001];
        for(int i=0;i<n;i++){
            nums[sc.nextInt()]++;
        }
        int odd=0;
        int even=0;
        int fk = 0;
        for(int i=0;i<100001;i++){
            if(nums[i]%2==1){
            	odd++;
            }
            else if(nums[i]>0){
            	even++;
            }
        }
        if(even%2==0){
        	fk = even;
        }else{
        	fk = even-1;
        }
        System.out.println(odd+fk);
    }
}