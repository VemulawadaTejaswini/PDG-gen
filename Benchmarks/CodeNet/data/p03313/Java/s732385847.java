import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[(int)Math.pow(2, N)];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int[] ans = new int[a.length];
        ans[0] = 0;
        int tmp = 0;

        for(int i = 1; i < a.length; i++){
            tmp = 0;
            ans[i] = Math.max(ans[i-1], a[i] + mmm(a, i));
            System.out.println(ans[i]);
        } 
    }
    public static int mmm (int[] a, int index)
    {
        //indexの２進数表記
        int[] mod2 = new int[19];
        int k = index;
        int count = 0;
        int j = -1;
        while(k > 0){
            j++;
            if(k % 2 == 0){
                k /= 2;
                mod2[j] = (int) Math.pow(2, count);
            }
            else{
                k = ( k - 1 ) / 2;
                mod2[j] = 0;
            }
            count++;
        }

        //配列aのうちindex以下で論理和を満たすものの最大値
        Arrays.sort(a, 0, index - 1);
        int max = index;
        boolean bool = true;
        do{
            max--;
            for(int i = 0; i <= j; i++)
            {
                if( a[max] % (int) Math.pow(2, mod2[i] + 1) != (int) Math.pow(2, mod2[i]) ){
                    bool = false;
                }
            }
        }while(bool == false && max > 0);
 //       System.out.print("mmm[" + index + "] = )
        return a[max];
    }
}