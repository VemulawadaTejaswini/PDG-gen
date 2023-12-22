import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
      //変数入力
      int x1 = sc.nextInt();
      int x2 = sc.nextInt();
      int x3 = sc.nextInt();
      int x4 = sc.nextInt();
      int x5 = sc.nextInt();
      
      
      //何番目に０があるか探す
     
       if(x1==0){
        System.out.println("1");
       }
       else if(x2==0){
        System.out.println("2");
       }
        else if(x3==0){
        System.out.println("3");
       } 
       else if(x4==0){
        System.out.println("4");
       }
       else if(x5==0){
        System.out.println("5");
       }
    }
}