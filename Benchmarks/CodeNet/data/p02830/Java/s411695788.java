import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        List<String> listS=new ArrayList<String>();
        List<String> listT=new ArrayList<String>();
        List<String> listFinal = new ArrayList<String>();

        for(int i=0;i<S.length();i++){
            listS.add(String.valueOf(S.charAt(i)));
        }
        for(int i=0;i<T.length();i++){
            listT.add(String.valueOf(T.charAt(i)));
        }
        for(int i=0;i<N;i++){
            listFinal.add(listS.get(i));
            listFinal.add(listT.get(i));
        }
        listFinal.forEach(System.out::print);
    }
}