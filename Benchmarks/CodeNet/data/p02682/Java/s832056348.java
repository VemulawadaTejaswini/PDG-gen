import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int n= sc.nextInt();
        int temp = n-a-b;
        if(temp<1){
            System.out.println(a);
        }else{
            System.out.println(a-temp);
        }


    }
}