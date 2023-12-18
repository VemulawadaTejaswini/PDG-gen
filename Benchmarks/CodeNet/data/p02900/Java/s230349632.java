import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        int div = 2;
        int maxdivA = (int)Math.sqrt(A);
        Set<Integer> primeA = new HashSet<>();
        primeA.add(1);
        while(maxdivA >= div){
            if(A % div == 0){
                A = A / div;
                primeA.add(div);
            }else{
                div++ ;
            }
        }
        primeA.add((int)A);
        div = 2;
        int maxdivB = (int)Math.sqrt(B);
        Set<Integer> primeB = new HashSet<>();
        primeB.add(1);
        while(maxdivB >= div){
            if(B % div == 0){
                B = B / div;
                primeB.add(div);
            }else{
                div++ ;
            }
        }
        primeB.add((int)B);
        // System.out.println(primeA);
        // System.out.println(primeB);
        primeA.retainAll(primeB);
        System.out.println(primeA.size());
    }
}