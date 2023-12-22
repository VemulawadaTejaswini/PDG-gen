import java.util.Scanner;

class Main{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

int x = scan. nextInt();

for(int i = 0; i <= x ; i++){
     if(i%10==3) continue;
     if(i%3==0) continue;


         System.out.print(i +" ");
}
         System.out.println();
}
}