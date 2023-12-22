import java.util.Scanner;

//This problem reminded me of Nabeatsu !!
public class Nabeatu{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
 //NabeatsuNo. 1<=i<=n
  for(int i=1;i<=n;i++){
    if(i%3==0)  //Output if i is multiple of 3
     System.out.printf(" "+i);
    else{
     int j=i;
     //Output if i has more than a digit which is 3
     do{
      if(j%10==3)
       System.out.printf(" "+i);
      else
       j/=10;
     }while(j>1&&j%10!=3);   //Be careful the duplication
    }
   }
  }
}