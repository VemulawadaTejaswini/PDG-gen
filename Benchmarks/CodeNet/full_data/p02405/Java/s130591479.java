import java.util.Scanner;
  
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(true){
int H=sc.nextInt();
int W=sc.nextInt();
if(H==0 && W==0){
System.out.printf("\n");
break;
}
for(int i=1;i<=H;i++){
 for(int j=1;j<=W;j++){
  if(j%2==1){
   System.out.printf("#");
   }else{
   System.out.printf(",");
   }
 }
 System.out.printf("\n");
}
System.out.printf("\n");
}
}
} 