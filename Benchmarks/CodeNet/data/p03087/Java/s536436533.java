import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<Q;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int num=0;
            for(int j = l-1;j<r-1;j++){
                char s = S.charAt(j);
                if(s=='A'){
                    char s2 = S.charAt(j+1);
                    if(s2=='C'){
                        num++;
                        j+=1;
                    }
                }
            }
            List.add(num);
        }
        for(int i:List) System.out.println(i);
    }
}
