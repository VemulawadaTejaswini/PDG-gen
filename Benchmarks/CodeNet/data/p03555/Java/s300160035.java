import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      char[][] C = new char[2][3];
      for(int i=0;i<2;i++){
        String s = sc.next();
        for(int j=0;j<3;j++){
          C[i][j] = s.charAt(j);
        }
      }
      for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
          if(C[i][j]!=C[1-i][2-j]){
            System.out.println("NO");
            return;
          }
        }
      }
        System.out.println("YES");
    }
}