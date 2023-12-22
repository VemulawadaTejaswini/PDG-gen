import java.util.Scanner;
class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int k = sc.nextInt();
      int d = sc.nextInt();
      int z = 1;
      for(int i = 0; i<= k; i++){
        if(x >=0){
          z = x - d*i;
        }
      System.out.println(z);
      }
    }
}