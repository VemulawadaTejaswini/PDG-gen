import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans = 0;
        int[] c = new int[10];
        for(int i=0;i<10;i++) c[i]=100;
        for(int i=0;i<M;i++){
            int s = sc.nextInt();
            if(c[s]==100){
                c[s] = sc.nextInt();
                ans += c[s]*((int)(Math.pow(10,N-s)));
            }
            else if(c[s]!=sc.nextInt()){
                ans = -1;
                break;
            }
            else int j = sc.nextInt();
        }
        System.out.println(ans!=0 ? ans:-1);
    }
}