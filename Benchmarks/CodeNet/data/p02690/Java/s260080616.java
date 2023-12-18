import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
      	int ansA = 0;
      	int ansB = 0;
        for(int A=0;A<=100;A++){
          for(int B=-1000;B<=1000;B++){
            double res = Math.pow(A, 5) - Math.pow(B, 5);
            if(res == X){
              ansA = A;
              ansB = B;
              break;
            }
            }
        }
      	
 	    System.out.println(ansA);
      	System.out.println(ansB);
    }
}