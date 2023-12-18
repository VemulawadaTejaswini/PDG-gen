
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c =scan.nextInt();
        int k = scan.nextInt();

        List<Integer> lista = Collections.nCopies(a,1);
        List<Integer> listb = Collections.nCopies(b,0);
        List<Integer> listc = Collections.nCopies(c,-1);

        List<Integer> main = new ArrayList<>();
        main.addAll(lista);
        main.addAll(listb);
        main.addAll(listc);

        int sum  = 0;
        Collections.sort(main);
        for(int i = main.size()-k ; i < main.size() ; i++){
            sum += main.get(i);
        }
        System.out.println(sum);


    }
}