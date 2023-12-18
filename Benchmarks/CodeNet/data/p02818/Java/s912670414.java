import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int A=scanner.nextInt();
    int B=scanner.nextInt();
    int K=scanner.nextInt();
    
    
    if(A>=K){
      A=A-K;
      System.out.println(A+""+B);
    }else if(A<K && A+B>K){
      int j=(A+B)-K;
      System.out.println(0+""+j);
    }else{
      System.out.println(0+""+0);
    }
                         }
                         }
                         
                        
                         