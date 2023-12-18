import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
      
      
      if(x==2||y==2){
        System.out.print("No");
      }else if(x==4||x==6||x==9||x==11){
        if(y==4||y==6||y==9||y==11){
           System.out.print("Yes");
        }
      }else if(x==1||x==3||x==5||x==7||x==8||x==10||x==12){
        if(y==1||y==3||y==5||y==7||y==8||y==10||y==12){
           System.out.print("Yes");
        }
      }else{
         System.out.print("No");
      }

      
    }
}