import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> sticks = new ArrayList<>();

    for(int i=0; i<N; i++)
        sticks.add(sc.nextInt());

    int sumTriangle = 0;
    for(int a=0; a<N-2; a++){
        for(int b=a+1; b<N-1;b++){
            for(int c=b+1; c<N;c++){
                if(checkTriangle(sticks.get(a),sticks.get(b),sticks.get(c)))
                    sumTriangle++;
            }
        }
    }

    System.out.println(sumTriangle);
  }

  public static boolean checkTriangle(int a, int b, int c){
        if(a >= (b+c))
            return false;
        if(b >= (c+a))
            return false;
        if(c >= (a+b))
            return false;
        
        return true;
  }
}