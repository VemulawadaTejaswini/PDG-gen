import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        char[] c = sc.next().toCharArray();
        int indA = 0;
        int indB = 0;
        int indC = 0;
        char now = 'a';
        while(indA < a.length && indB < b.length && indC < c.length){
            if(now == 'a'){
                indA++;
                if(indA == a.length){
                    System.out.println("A");
                    return;
                }
                now = a[indA];
            }else if(now == 'b'){
                indB++;
                if(indB == b.length){
                    System.out.println("B");
                    return;
                }
                now = b[indB];
            }else{
                indC++;
                if(indC == c.length){
                    System.out.println("C");
                    return;
                }
                now = c[indC];
            }
        }
        System.out.println("");
    }
}
