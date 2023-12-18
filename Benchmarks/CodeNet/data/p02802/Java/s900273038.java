import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

    boolean[] isAC = new boolean[N];
    Arrays.fill(isAC,false);
    for(int i=0; i<M; i++){
        int index = sc.nextInt()-1;
        String s = sc.next();
        if(s.equals("AC")&&isAC[index]==false){
            isAC[index]=true;
            count1++;
            count3 += count2;
        }else if(s.equals("WA")&&isAC[index]==false){
            count2++;
        }
    }
    System.out.print(count1 + " ");  
    System.out.print(count3);  
    return;
  }
}



