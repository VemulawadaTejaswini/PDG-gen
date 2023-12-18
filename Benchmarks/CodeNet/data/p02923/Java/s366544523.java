import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b;
        int n = 0;
        int bestn = 0;
        for(int i = 0; i < a;i++){
            b[i] = sc.nextInt();
        }
        for(int x=1; x >= a ;x++){
            int wk = b[i];
            n = 0;
            for(int y=i; y >= a ;y++){
                if(b[y] >= b[y+1]){
                    break;
                }else{
                    n++;
                }
            }
            if(bestn < n){
                bestn = n;
            }
        }
        System.out.println(bestn);
        sc.close();
    }
}
