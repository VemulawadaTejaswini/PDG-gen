import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();
        var A = new LinkedList<Integer>();
        if(N == 0) {
            System.out.println(0);
            return;
        }
        if(N == 1) {
            System.out.println(1);
            return;
        }
        
        for(int i=0; i<N; i++)
            A.add(scanner.nextInt());

        A.sort(Comparator.naturalOrder());
        var numP = 0;
        int max = A.getLast();
        for(var p = A.getFirst(); p*p < max; p = A.getFirst()) {
            A.removeFirst();
            boolean isPExistInRemains = false;
            for(Iterator<Integer> ite = A.iterator(); ite.hasNext();) {
                var next = ite.next();
                if(next % p == 0) ite.remove();
                if(next.equals(p)) isPExistInRemains = true;
            }
            if(!isPExistInRemains) numP++;
        }
        numP += A.size();
        System.out.println(numP);
    }
}