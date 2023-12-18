import java.util.*;

class Main{
    public static void main(String[]args){
        String result;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a+b<=c){
            result = "Yes";
        }
        else{
            result = "No";
        }
        System.out.print(result);
    }
}