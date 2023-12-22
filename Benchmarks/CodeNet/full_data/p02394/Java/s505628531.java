import java.util.*;
   
class Main{
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    int w = input.nextInt();
    int h = input.nextInt();
    int x = input.nextInt();
    int y = input.nextInt();
    int r = input.nextInt();
    int inputhightforcircle = (y + r);//5
    int inputwideforcircle = (x + r);//3
     
    if(inputhightforcircle <= h && inputwideforcircle <= w){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
     
  }
}