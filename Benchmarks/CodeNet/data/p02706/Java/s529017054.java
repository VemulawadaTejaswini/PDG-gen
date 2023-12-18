import java.util.*;
class Main{
    static public void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] arr = new int[m];
        
        int sum = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        
        if(sum-n >= 0){
            System.out.println(sum-n);
        }
        else{
            System.out.println(-1);
        }
    }
}