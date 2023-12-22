import java.util.Scanner;

public class Main{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int i=0,j=0,k=1;
if(a==0&&b==0){
    System.exit(0);
}else{
 for(i=0;i<a;i++){
     k++;
    for(j=0;j<b;j++){
        if((j+k)%2==0){
            System.out.print("#");
        }else System.out.print(".");
    }
    System.out.println("");
 }
    }
}
}

