import java.util.Scanner;
class Main{
    long sum;
    int i,x,y,max,min;
public void yatary() { 
     Scanner sc = new Scanner(System.in);
     max = -1000000;
     min = 1000000;
     sum = 0;
     x = sc.nextInt();
   if(x == 0){    
    max = 0;     
    min = 0; 
   }else{
       for(i = 1;i <= x; i++){
         y = sc.nextInt();
         sum = y + sum;
         if(x == 1){  
           max = y;       
           min = y; 
         }       
          if(y > max){     
           max = y;
         }else if (y < min){
           min = y;
          }else if (y == min || y == max){
              continue;
        }
      }  
       System.out.println(min + " " + max + " " + sum);
    }
}
public static void main(String[]args){ 
   new Main().yatary();   
  }
} 