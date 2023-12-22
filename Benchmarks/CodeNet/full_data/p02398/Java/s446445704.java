import java.util.Scanner;
class Main{   
 public void yatary() {  
      Scanner sc = new Scanner(System.in); 
        int a; 
        int b;
        int c;
        int i;
        int x;
        int y=0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
     for(i=a;i<=b;i++){
         x = c%i;
         if(x==0){
             y++;
     }
     }
     System.out.println(y);
     }
public static void main(String[] args){ 
    new Main().yatary();    
}
} 