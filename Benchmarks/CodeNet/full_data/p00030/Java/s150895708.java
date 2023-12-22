import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num=10;
    int count=0;
    int power=(int)Math.pow(2,num)/1;
    String binary;
    int array[]=new int[num+1];
    while(true){
      count=0;
      int n=sc.nextInt();
      int s=sc.nextInt();
      if(n==0&&s==0) break;
      for(int i=0;i<power-1;i++){
        int sum1=0,sum2=0;
        binary=Integer.toBinaryString(i+1+power);
        for(int j=0;j<num;j++){
          if(binary.charAt(j+1)=='0') array[j]=0;
          else if(binary.charAt(j+1)=='1') array[j]=1;
        }
        for(int j=0;j<num;j++){
          sum1+=array[j];
        }
        if(sum1!=n){
          continue;
        }else if(sum1==n){
          for(int k=0;k<num;k++){
            sum2+=k*array[k]; 
          }
          if(sum2==s){
            count+=1;
          }
        }
      }
      System.out.println(count);
    }
    sc.close();
  }
}
