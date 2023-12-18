import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] s = new int[M];
        String[] c = new String[M];

        for(int i=0; i<M; i++){
            s[i] = sc.nextInt();
            c[i] = sc.next();
        }
        int x, y;
        if(N==1){
            x = 0;
            y = 9;
        }
        else if(N==2){
            x = 10;
            y = 99;
        }
        else{
            x = 100;
            y = 999;
        }
        loop:for(int i=x; i<=y; i++){
            String st = String.valueOf(i);
            for(int j=0; j<M; j++){
                if(st.charAt(s[j]-1)!=c[j].charAt(0)){
                    break;
                }
                if(j==M-1){
                    System.out.println(st);
                    break loop;
                }
            }
            if(i==y){
                System.out.println(-1);
            }
        }
    }
}