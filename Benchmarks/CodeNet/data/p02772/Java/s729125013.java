import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]A = new int[N];
    
    int cou = 0;
    for(int i=0; i<N; i++){
        A[i] = sc.nextInt();
        if(A[i]%2==0){
        if(A[i]%3!=0 && A[i]%5!=0){
            cou++;
    }
    }
}
    if(cou==0){
            System.out.println("APPROVED");
    }else{
            System.out.println("DENIED");
        }
    }
}