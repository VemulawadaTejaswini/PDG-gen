import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int[] arr = {a,b,c};
        int k = nextInt();

        int aa = 0;
        int bb = 0;
        int cc = 0;
        for(aa=0;aa<=k;aa++){
            for(bb=0;bb<=k;bb++){
                for(cc=0;cc<=k;cc++){
                    if(aa+bb+cc<=k){
                        arr[0]=nibai(arr[0],aa);
                        arr[1]=nibai(arr[1],bb);
                        arr[2]=nibai(arr[2],cc);
                        if(arr[2]>arr[1] && arr[1]>arr[0]){
                            print("Yes");
                            System.exit(0);
                        }
                        else{
                            arr[0] = a;
                            arr[1] = b;
                            arr[2] = c;
                        }
                    }
                }
            }
        }
        print("No");
    }
    public static int nibai(int num, int con){
        for(int i=0;i<con;i++){
            num*=2;
        }
        return num;
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