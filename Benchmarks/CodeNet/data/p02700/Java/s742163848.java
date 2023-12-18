import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
      	int B= sc.nextInt();
      	int C= sc.nextInt();
      	int D= sc.nextInt();
      	int c1 = 0;
      	int c2 = 0;
        while(C > 0){
          C = C - B;
          c1 += 1;
        }
      	while(A > 0){
          A = A - D;
          c2 += 1;
        }
      	if (c2 >= c1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}