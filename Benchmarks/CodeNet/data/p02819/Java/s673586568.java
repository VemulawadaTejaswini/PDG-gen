import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean end = judge(x);
        while(!end){
            x++;
            end = judge(x);
        }
        System.out.println(x);
    }
    public static boolean judge(int x){
        if(x==2){
            return true;
        }
        if(x%2==0){
            return false;
        }
        for(int i = 3;i*i<=x;i+=2){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}