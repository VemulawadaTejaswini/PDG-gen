import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;
        //4/N = ca+cb+ab/abc;
        boolean flg1 = true;
        boolean flg2 = true;
        while(true){
            if((c*a+c*b+a*b)%4==0 && (a*b*c)%N==0 && (c*a+c*b+a*b)/4==a*b*c/N){
                break;
            }else{
                if(flg1){
                    a++;
                    flg1=false;
                }else if(flg2){
                    b++;
                    flg2=false;
                }else{
                    c++;
                    flg1=true;
                    flg2=true;
                }
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}
