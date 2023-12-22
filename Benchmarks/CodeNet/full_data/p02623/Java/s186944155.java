import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] arr3 = new int[n+m];
        int tmp1 = 0;
        int tmp2 = 0;
        long sum = 0L;
        int con = 0;
        for(int i=0;i<n;i++){
            arr1[i]=nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=nextInt();
        }

        for(int a:arr1){
            sum +=a;
        }
        for(int a:arr2){
            sum +=a;
        }
        if(sum<k){
            print(n+m);
            System.exit(0);
        }
        
        sum=0;
        for(int i=0;i<m+n;i++){
            if(arr1[tmp1]<arr2[tmp2]){
                sum+=arr1[tmp1];
                tmp1+=1;
            }
            else{
                sum+=arr2[tmp2];
                tmp2+=1;
            }
            if(sum>k){
                break;
            }
            if(tmp1>n||tmp2>m){
                break;
            }
            con +=1;
        }
        print(con);
    }

    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }

    //print
    public static void print(Object a){
        System.out.println(a);
    }


    //gcd
    public static int gcd (int a, int b){
        int tmp;
        while((tmp = a%b) != 0){
            a = b;
            b = tmp;
        }
        return b;
    }


    //lcm
    public static int lcm(int a,int b){
        int tmp;
        long c = a;
        c *= b;
        while((tmp = a%b) != 0){
            a = b;
            b = tmp;
        }
        return (int)(c/b);
    }
}