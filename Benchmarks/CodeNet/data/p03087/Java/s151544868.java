import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> OPT = new ArrayList<>();
        for(int i=0;i<N-1;i++) {
            char s = S.charAt(i);
            char s2 = S.charAt(i+1);
            if(s=='A'&&s2=='C'){
                List.add(1);
                List.add(0);
                i++;
            }
            else if(s2=='A'){
                List.add(0);
            }
            else{
                List.add(0);
                List.add(0);
                i++;
            }
        }
        for(int i=0;i<Q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int num =0;
            for(int j = l-1;j<r-1;j++) num+=List.get(j);
            OPT.add(num);
        }
        for(int i:OPT) System.out.println(i);

    }
}
