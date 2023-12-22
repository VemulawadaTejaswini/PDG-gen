import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0;i<n;i++){
            a[i] = src.nextInt();
        }

        for(int i=0;i<n;i++){
            b[i] = src.nextInt();
        }

        int[] ans = new int[n];
        String out = "No";

        for(int i=1;i<n;i++){
            if(check(a,b,ans,i)){
                out="Yes";
                break;
            }else{
                ans = new int[n];
            }
        }

        System.out.println(out);
        if(out.equalsIgnoreCase("Yes")){
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
        }


    }

    private static boolean check(int[] a, int[] b, int[] ans, int i) {

        int len = a.length;
        for(int j=0;j<len;j++){
            if(a[i]==b[j]){
                return false;
            }else{
                ans[i] = b[j];
                i++;
                i%=len;
            }
            //System.out.println("II "+i);
        }

        return true;


    }
}