import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();

   int x=0;
   int k=0;


   while(k==0){
     for(int i=0;i<10000;i++){
     if(i*0.08==a&&i*0.1==b){
     x=i;
     k=1;
   }
 }
}

if(k==1){
  System.out.println(x);
}else{
  System.out.println(-1);
}

}
}