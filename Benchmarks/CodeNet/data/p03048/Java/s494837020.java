import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int a = n/r;
        int bb = n/g;
        int c = n/b;
        int sum=0;
        for(int i = 0;i<=a;i++){
            for(int j=0;j<=bb;j++){
                for (int k=0;k<=c;k++){
                    int goukei =(r*i)+(g*j)+(b*k);
                    if(goukei==n){
                        sum++;
                        if(goukei>n) {
                            break;
                        }
                    }
                    if(goukei>n){
                        break;
                    }
                }
                if(goukei>n){
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}