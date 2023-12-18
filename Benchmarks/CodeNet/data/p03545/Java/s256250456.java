import java.util.*;
class Main(){
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int bcd[3];
    for(int i=0;i<3;i++){
      bcd[i]=sc.nextInt();
    }
    for(int i=0;i<1<<3;i++){
      int sum=a;
      char pm[3];
      for(int j=0;j<3;j++){
        if((1&(i>>j))==1){
          sum=sum-bcd[j];
          pm[j]='-';
        }
        else{
          sum=sum+bcd[j];
          pm[j]='+';
        }
      }
      if(sum==7){
        System.out.print(a);
        for(int j=0;j<3;j++){
          System.out.print(pm[j]+bcd[j]);
        }
        System.out.println("=7");
        break;
      }
    }
  }
}