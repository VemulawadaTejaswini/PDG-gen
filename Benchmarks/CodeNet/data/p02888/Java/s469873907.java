import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sticks[] = new int[N];

    for(int i=0; i<N; i++)
        sticks[i] = sc.nextInt();

    int sumTriangle = 0;
    for(int a=0; a<N-2; a++){
        for(int b=a+1; b<N-1;b++){
            for(int c=b+1; c<N;c++){
                if(checkTriangle(sticks[a],sticks[b],sticks[c]))
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