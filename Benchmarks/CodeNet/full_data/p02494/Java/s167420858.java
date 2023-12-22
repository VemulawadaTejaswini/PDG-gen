import java.util.Scanner;
  
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char c = '#';
    while(true){
      int height = sc.nextInt();
      int wide = sc.nextInt();
  
      if(height == 0 || wide == 0){
       break;
      }
  
      for(int i=0;i<height;i++){
        for(int j=0;j<wide;j++){
          System.out.print(c);
        }
        System.out.println("");
      }
      System.out.println("");
    }
  }
}