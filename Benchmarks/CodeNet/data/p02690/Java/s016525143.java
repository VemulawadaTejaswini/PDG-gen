import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	long X = sc.nextInt();
        int A = 0;
        int B = 0;
        boolean tf = false;
		
      	for(int i=-100; i<100; i++){
          for(int j=-100; j<100; j++){
            if(i*i*i*i*i - j*j*j*j*j == X){
              A = i;
              B = j;
              tf = true
              break;
            }
          }
          if(tf) break;
        }
        System.out.println(A+" "+B);
    }
}