import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        boolean exist;
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N-i;j++){
                    if(Y==i*10000+j*1000+(N-i-j)*100){
                        System.out.println(i+" "+j+" "+(N-i-j));
                        return;

                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}