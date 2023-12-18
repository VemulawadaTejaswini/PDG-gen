import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	long X = sc.nextInt();
        int A = 0;
        int B = 0;
		
      	for(int i=-130; i<130; i++){
          for(int j=-130; j<130; j++){
            if(Math.pow(i,5) - Math.pow(j,5) == X){
              A = i;
              B = j;
              break;
            }
          }
        }
        System.out.println(A+" "+B);
    }
}
