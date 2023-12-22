import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);            
//        int num = sc.nextInt();
        //int count = 0;
//        int y = 1;
//?´???°??????????????°??????        
//        for(int i = 0; i < num; i ++) {
//            //num = sc.nextInt();
//            if(num % y != 0) {
//                y ++;
                //count ++;
//            }else if(num % y == 0){
                //count ++;                
//                System.out.println(y);
//                y ++;
//            }
//        }

//?????????????????´??°a??????b?????§?????´??°????????????????????????????????°??????
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        
//          for(int i = 0; i <= b; i++) {
//              if(i < a) {
//                  continue;
//              }else if(i >= a) {
//                  System.out.print(i +" ");
//              }else if(i == b) {
//                  System.out.print(i);
//              }
//          }
//?????????????????´??°a??????b?????§?????´??°????????????????????????????????°??????
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        int y = 1;
        
          for(int i = 0; i <= b; i++) {
//              if(1 <= a && a <= 10000 &&
//                 1 <= b && b <= 10000 &&
//                 1 <= c && c <= 10000 && a <= b) {
                  
              if(i < a) {
                  continue;
              }else if(i >= a && i < b) {
                  //System.out.print(i +" ");
                  //if a == ?´???°????????????????????¢??????
                  if(c % i == 0) {
                      count ++;
                      }                  
              }else if(i == b) {
                  //System.out.print(i);
                  if(c % i == 0) {
                      count ++;
                      }
                  }
//                }else {
//                  break;
//              }
            }
          if(1 <= a && a <= 10000 &&
             1 <= b && b <= 10000 &&
             1 <= c && c <= 10000 && a <= b) {
              System.out.println(count);
          }
    }
          
        //System.out.println(count);
}