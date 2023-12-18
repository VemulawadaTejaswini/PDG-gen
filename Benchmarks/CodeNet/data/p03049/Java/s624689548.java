import java.util.*;
public class Main {
    public static void main(String[] args){
        Main start=new Main();
        start.start();

    }
    public Main(){
    }
    public void start(){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
//        char[][] s=new char[N][];
        int bCount=0;
        int aCount=0;
        int result=0;
        for(int i=0;i<N;i++){
            char[] t=sc.next().toCharArray();
            for(int j=0;j<t.length-1;j++){
                if(t[j]=='A'&&t[j+1]=='B'){
                    result++;
                }
            }
            if(t[0]=='B'){
                bCount++;
            }
            if(t[t.length-1]=='A'){
                aCount++;
            }
        }
        System.out.println(result+Math.min(N-1,Math.min(aCount,bCount)));

    }
    int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}