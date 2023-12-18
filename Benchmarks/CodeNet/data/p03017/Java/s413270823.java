import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String str = sc.next();
        
        if(C<D){
            String str1 = str.substring(A,D);
            if(str1.contains("##")){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }else{
            String str1 = str.substring(A,C);
            String str2 = str.substring(A,C);
            if(B>=2 && D<=N-2){
                str2 = str.substring(B-2,D+2);
                //System.out.println("a");
            }else if(B>=2 && D>N-2){
                str2 = str.substring(B-2,D+1);
                //System.out.println("b");
            }else if(B<2 && D<=N-2){
                str2 = str.substring(B-1,D+2);
                //System.out.println("c");
            }else if(B<2 && D>N-2){
                str2 = str.substring(B-1,D+1);
                //System.out.println("d");
            }
            
            if(str2.contains("...") && !str1.contains("##")){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            //System.out.println(str1);
            //System.out.println(str2);
        }
    }
}