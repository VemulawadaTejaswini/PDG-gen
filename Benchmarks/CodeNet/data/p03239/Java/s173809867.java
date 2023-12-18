import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] num = new int[2*N];
    int min = 1001;
    //String str = sc.next();
    for(int i=0; i<2*N; i++){
        num[i] = sc.nextInt();
    }    
    for(int i=0; i<N; i++){
        //System.out.println(i+":"+num[2*i]+"-"+num[2*i+1]);
        if(num[2*i+1] > T){
            num[2*i] = 1001;
        }
    }
    
    for(int i=0; i<N; i++){
        if(min > num[2*i]){
            min = num[2*i];
            //System.out.println(i+":"+min);
        }
    }
    //if(str[0].equals("H"));
    if(min == 1001){
        System.out.println("TLE");
    }else{
    System.out.println(min);
    }
  }
}
