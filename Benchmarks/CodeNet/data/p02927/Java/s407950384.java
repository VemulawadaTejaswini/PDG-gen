import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int M = sc.nextInt();
      int D = sc.nextInt();
      int count=0;
      for(int i=1;i<M+1;i++){
        for(int j=20;j<D+1;j++){
          int d1 = j/10;
          int d2 = j%10;
          if(d2>=2 && d1*d2==i){
            count++;
          }
        }
      }
      System.out.println(count);
    }
}