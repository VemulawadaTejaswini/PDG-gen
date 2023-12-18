import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int initPoint = sc.nextInt();
    int nQuestion = sc.nextInt();
    int participant[] = new int[N];
    
    for(int i=0; i<N; i++){
      participant[i] = initPoint;
    }
    
    for(int i=0; i<nQuestion; i++){
      sc.nextLine();
      int correctNum = sc.nextInt();
      for(int j=0; j<N; j++){
        if(j!=(correctNum-1))
          participant[j]--;
      }
    }
      
    for(int i=0; i<N; i++){
      if(participant[i] > 0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}