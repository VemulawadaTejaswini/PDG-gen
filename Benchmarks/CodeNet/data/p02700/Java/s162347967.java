import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    //int[] num = new int[N];
    //int count = 0;
    while(A > 0 && C > 0){
        C -= B;
        if(C <= 0){
            break;
        }
        A -= D;
    }
    //System.out.println(A+","+C);
    if(A <=0){
        System.out.println("No");
    }else{
        System.out.println("Yes");
    }
    /*for(int i=0; i<N; i++){
        num[i] = sc.nextInt();
        H -= num[i];
    }*/
    //if(str.charAt(0) == str.charAt(1)){
    //}
  }
}