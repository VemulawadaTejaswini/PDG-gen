import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);


    while(true){
      int h=s.nextInt();
      int w=s.nextInt();

      if(h==0 && w==0){
        break;
      }

      for(int i=1;i<=h;i++){
        for(int j=1;j<=w;j++){
          if(i==1 || i==h){
            System.out.print('#');
          } else {
			System.out.print('.');
			}
        }
        System.out.println();
      }
      System.out.println();
    }

  }
}