import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int s[] = new int[M];
        int c[] = new int[M];
        for(int i=0; i<M; i++){
            s[i] = in.nextInt();
            c[i] = in.nextInt();
        }

        boolean flag = true;
        int num[] = new int[N];

        for(int i=0; i<N; i++){
            num[i] = -1;
        }

        for(int i=0; i<M; i++){
            if(s[i]-1 > N){
                flag = false;
                break;
            }
            if(num[s[i]-1] == -1){
                num[s[i]-1] = c[i];
            }else{
                if(num[s[i]-1] != c[i]){
                    flag = false;
                    break;
                }
            }
        }

        //
        if(num[0] == 0 && N != 1) flag = false;
        
        if(flag){
            for(int i=0; i<num.length; i++){
                if(i==0){
                    if(num.length != 1 && num[i] == -1) System.out.print("1");
                    else System.out.printf("%d", num[i]);
                }else{
                    if(num[i] == -1) System.out.print("0");
                    else System.out.printf("%d", num[i]);
                }     
            }
        }else{
            System.out.print("-1");
        }
    }
}