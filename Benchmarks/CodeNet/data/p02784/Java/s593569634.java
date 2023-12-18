import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a = 0;
        for(int i=0;i<n;i++){
            a = sc.nextInt();
            h = h - a;
            if(h <=0){
                System.out.println("Yes");
                break;
            } else{
                System.out.println("No");
                break;
            }

        }
    }
}