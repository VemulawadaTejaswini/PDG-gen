import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int X = sc.nextInt();
      	int Y = sc.nextInt();
      	boolean ans = false;
      	for(int i=0;i<X+1;i++){
          for(int j=X-i;j>=0;j--){
            if( i*2 + j*4 == Y ){
              ans = true;
              i = X + 1;
              j = -1;
            }
          }
        }
      if( ans ){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }       
	}
}