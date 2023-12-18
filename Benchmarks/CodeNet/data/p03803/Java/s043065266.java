import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextInt();
        String b = sc.nextInt();
        if(a==b){
            System.out.println("Draw");
        }else if(a % 13 > b % 13){
            System.out.println("Alice");
        }else{
            System.out.println("Bob");
        }
    }
}