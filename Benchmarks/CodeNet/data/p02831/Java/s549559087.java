import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int na=scan.nextInt();
int nb=scan.nextInt();
  
int sum=1;
  for(int i=1;i<(na+nb)/2;i++){
      if(na%i==0&&nb%i==0){
          sum=i;
      }
  }
System.out.println(na*nb/sum);
  
}
}