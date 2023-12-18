import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();
 
    int cou = 0;
    for(int i=0; i<4; i++){ 
        if(ss[i]==('+')){
        cou++;
        }
    }
    int mai =4-cou;
    int ans = cou-mai;
		System.out.println(ans); 
}
}