import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]L = new int[N];

    int all = 0;
    for(int i=0; i<N; i++){
        L[i] = sc.nextInt();
        all += L[i];
    }   
    Arrays.sort(L);
    int max = L[N-1];
    int hoka = all-max;

    if(max<hoka){
    System.out.println("Yes");     
    }else{
    System.out.println("No");    
    }
  }
}
