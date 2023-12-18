import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int data[]= new int[5];
       data[0] = sc.nextInt();
       data[1] = sc.nextInt();
       data[2] = sc.nextInt();
       data[3] = sc.nextInt();
       data[4] = sc.nextInt();



      int k = sc.nextInt();

      for(int i = 0;i<5;i++){
        for(int j = i+1;j<5;j++){
          if(Math.abs(data[i]-data[j])>k){
            System.out.println(":(");
            System.exit(0);
          }
        }
      }
      System.out.println("Yay!");
  }
}