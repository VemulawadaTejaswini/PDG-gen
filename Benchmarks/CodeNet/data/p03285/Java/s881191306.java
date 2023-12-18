import java.util.*;
public class Main {
      static Scanner sc=new Scanner(System.in);
      public static void main(String[] args) {
            int x=sc.nextInt();
if(x<8){
System.out.println("No");
return;
}
            if(x%4==0||x%7==0){
                  System.out.println("Yes");
                  return;
            }
            else{
                  for(int i=4; i<=x; i+=4){
                        for(int j=i+7; j<=x; j+=7){
                              
                              if(j==x){
                                    System.out.println("Yes");
                                    return; 
                              }
                        }
                  }
            }
            System.out.println("No");
      }
}
