import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
      	int ansA = 0;
      	int ansB = 0;
        for(int A=-100;A<=100;A++){
          for(int B=-100;B<=100;B++){
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