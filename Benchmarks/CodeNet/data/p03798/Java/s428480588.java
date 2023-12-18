import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            if(s.charAt(i) == 'o'){
                a[i] = 0;
            }
            else{
                a[i] = 1;
            }
        }

        char[] c = new char[N];
        boolean bl = false;
        if(bl == false){ //SS
            c[0] = 'S'; c[1] = 'S';
            for(int i = 2; i < N; i++){
                if((a[i-1] == 0 && c[i-2] == 'S' && c[i-1]== 'S') || (a[i-1] == 1 && c[i-2] == 'W' && c[i-1] == 'S')
                 ||(a[i-1] == 0 && c[i-2] == 'W' && c[i-1]== 'W') || (a[i-1] == 1 && c[i-2] == 'S' && c[i-1] == 'W')){
                    c[i] = 'S';
                }
                else{
                    c[i] = 'W';
                }
            }
            if((a[N-1] == 0 && c[N-2] == 'S' && c[N-1]== 'S' && a[0] == 0) || (a[N-1] == 1 && c[N-2] == 'W' && c[N-1] == 'S' && a[0] == 0)
             ||(a[N-1] == 0 && c[N-2] == 'W' && c[N-1]== 'W' && a[0] == 1) || (a[N-1] == 1 && c[N-2] == 'S' && c[N-1] == 'W' && a[0] == 1)){
                bl = true;
            }
        }
        if(bl == false){ //SW
            c[0] = 'S'; c[1] = 'W';
            for(int i = 2; i < N; i++){
                if((a[i-1] == 0 && c[i-2] == 'S' && c[i-1]== 'S') || (a[i-1] == 1 && c[i-2] == 'W' && c[i-1] == 'S')
                 ||(a[i-1] == 0 && c[i-2] == 'W' && c[i-1]== 'W') || (a[i-1] == 1 && c[i-2] == 'S' && c[i-1] == 'W')){
                    c[i] = 'S';
                }
                else{
                    c[i] = 'W';
                }
            }
            if((a[N-1] == 0 && c[N-2] == 'S' && c[N-1]== 'S' && a[0] == 1) || (a[N-1] == 1 && c[N-2] == 'W' && c[N-1] == 'S' && a[0] == 1)
             ||(a[N-1] == 0 && c[N-2] == 'W' && c[N-1]== 'W' && a[0] == 0) || (a[N-1] == 1 && c[N-2] == 'S' && c[N-1] == 'W' && a[0] == 0)){
                bl = true;
            }
        }   
        if(bl == false){ //WS
            c[0] = 'W'; c[1] = 'S';
            for(int i = 2; i < N; i++){
                if((a[i-1] == 0 && c[i-2] == 'S' && c[i-1]== 'S') || (a[i-1] == 1 && c[i-2] == 'W' && c[i-1] == 'S')
                 ||(a[i-1] == 0 && c[i-2] == 'W' && c[i-1]== 'W') || (a[i-1] == 1 && c[i-2] == 'S' && c[i-1] == 'W')){
                    c[i] = 'S';
                }
                else{
                    c[i] = 'W';
                }
            }
            if((a[N-1] == 0 && c[N-2] == 'S' && c[N-1]== 'W' && a[0] == 0) || (a[N-1] == 1 && c[N-2] == 'W' && c[N-1] == 'W' && a[0] == 0)
             ||(a[N-1] == 0 && c[N-2] == 'W' && c[N-1]== 'S' && a[0] == 1) || (a[N-1] == 1 && c[N-2] == 'S' && c[N-1] == 'S' && a[0] == 1)){
                bl = true;
            }
        } 
        if(bl == false){ //WW
            c[0] = 'W'; c[1] = 'W';
            for(int i = 2; i < N; i++){
                if((a[i-1] == 0 && c[i-2] == 'S' && c[i-1]== 'S') || (a[i-1] == 1 && c[i-2] == 'W' && c[i-1] == 'S')
                 ||(a[i-1] == 0 && c[i-2] == 'W' && c[i-1]== 'W') || (a[i-1] == 1 && c[i-2] == 'S' && c[i-1] == 'W')){
                    c[i] = 'S';
                }
                else{
                    c[i] = 'W';
                }
            }
            if((a[N-1] == 0 && c[N-2] == 'S' && c[N-1]== 'W' && a[0] == 1) || (a[N-1] == 1 && c[N-2] == 'W' && c[N-1] == 'W' && a[0] == 1)
             ||(a[N-1] == 0 && c[N-2] == 'W' && c[N-1]== 'S' && a[0] == 0) || (a[N-1] == 1 && c[N-2] == 'S' && c[N-1] == 'S' && a[0] == 0)){
                bl = true;
            }
        }
        if(bl == true){
            for(int i = 0; i < N; i++){
                System.out.print(c[i]);
            }
        }
        else{
            System.out.print(-1);
        }
    }
}