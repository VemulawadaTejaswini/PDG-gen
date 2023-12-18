import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	long X = sc.nextInt();
        long A = 0;
        long B = 0;
        boolean tf = false;
		
      	for(int i=-130; i<130; i++){
          for(int j=-130; j<130; j++){
            if(i*i*i*i*i - j*j*j*j*j == X){
              A = i;
              B = j;
              tf = true;
              break;
            }
          }
          if(tf) break;
        }
        System.out.println(A+" "+B);
    }
}
