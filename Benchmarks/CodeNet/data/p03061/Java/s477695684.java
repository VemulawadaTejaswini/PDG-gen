import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        // System.out.println(a.length);
        int[] ans=new int[n];
        int max=0;
        if(n==2){
            System.out.println(Math.max(a[0], a[1]));
        }else{
            for(int i=0; i<n; i++){
                int[] temp=new int[n-1];
                temp=jogai(a,i);
                // for(int j=0; j<n-1; j++){
                //     System.out.println(temp[j]);
                // }
                ans[i]=mygcd(temp,n-1);
                if(max<ans[i]){
                    max=ans[i];
                }
            }
            System.out.println(max);
        }
    }
    
    public static int[] jogai(int[] nums, int index){
        int[] array=new int[nums.length-1];
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(i!=index){
                array[j]=nums[i];
                j++;
            }
        }
        return array;
    }

    public static int mygcd(int[] nums, int n){
        if(n==2){
            return gcd(nums[0],nums[1]);
        }else{
            int[] temp=new int[n-1];
            for(int i=0; i<n-2; i++){
                temp[i]=nums[i];
            }
            temp[n-2]=gcd(nums[n-2], nums[n-1]);
            return mygcd(temp, n-1);
        }
    }
    
    public static int gcd(int a, int b){
        int warareru=Math.max(a,b);
        int waru=Math.min(a,b);
        int amari=waru;
        while(amari!=0){
            amari=warareru%waru;
            warareru=waru;
            waru=amari;
        }
        return warareru;
    }
}
