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
        if( k==1 ) bl = false;
        if( k==2 ) bl = true;
        if( k>=3){
            for(int j=3; j*j<=k; j+=2){
                if(k % j == 0){
                    bl = false;
                    break;
                }
            }
        }
        return(bl);
    }
}