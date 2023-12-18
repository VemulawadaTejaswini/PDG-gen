import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int cnt = N / a ;
        int min = a;
        if(a>b){
          cnt = N / b + 1 + cnt;
          min = b;
        }else{
          cnt++;
        }
        if(min>c){
          cnt = N / c + 1 + cnt;
          min = c;
        }else{
          cnt++;
        }
        if(min>d){
          cnt = N / d + 1 + cnt;
          min = d;
        }else{
          cnt++;
        }
        if(min>e){
          cnt = N / e + cnt;
        }else{
          cnt++;
        }
        System.out.println(cnt);
    }
}
