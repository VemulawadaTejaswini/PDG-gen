import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        a[0] = 11;
        int num = a[0];
        System.out.println(a[0] + " ");

        boolean bl;
        for(int i=1; i<n; i++){
            do{
                num += 10;
            }while(primJudge(num) == false);
            a[i] = num;
            System.out.println(a[i] + " ");   
        }
    }

    public static  boolean primJudge (int k){
        boolean bl = true;
        for(int j=2; j*j<=k; j++){
            if(k % j == 0){
                bl = false;
                break;
            }
        }
        return(bl);
    }
}