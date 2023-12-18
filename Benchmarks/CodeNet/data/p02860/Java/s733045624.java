import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[]ss = S.toCharArray();
    
    int cou = 0;
    if(N%2==0){
    for(int i=0; i<N/2; i++){
        for(int j=N/2; j<N; j++){
    if(ss[i]==ss[j]){
        cou++;    
    }
        }
    }
}
    if(N%2!=0){
    System.out.println("No");
    }else if(cou==N/2){
    System.out.println("Yes");
    }else{
    System.out.println("No");   
        }
    }
}