import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] array = new int[n];
        int sum = 0;
        
        for(int i=0 ; i<m ; i++){
            array[i] = sc.nextInt();
            sum +=array[i];
        }
        
        int total = n-sum;
        
        if(total<=0){
            System.out.println(-1);
        }else{
            System.out.println(total);
        }
    }
}