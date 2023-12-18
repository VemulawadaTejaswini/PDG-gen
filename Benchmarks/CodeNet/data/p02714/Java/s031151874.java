import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> g = new ArrayList<>();
        HashSet<Integer> b = new HashSet<>();
        
        for(int i=0; i<N; i++){
            if(S.charAt(i) == 'R'){
                r.add(i+1);
            }else if(S.charAt(i)=='G'){
                g.add(i+1);
            }else{
                b.add(i+1);
            }
        }
        long sum = 0;
        int sizeb = b.size();
        for(Integer i :r){
            for(Integer j:g){
                sum += sizeb;
                if(b.contains(2*j-i)){
                    sum -= 1;
                }
                if(b.contains(2*i-j)){
                    sum -= 1;
                }
                if((i+j)%2==0){
                    if(b.contains((i+j)/2)){
                        sum -=1;
                    }
                }
            }
        }
        System.out.println(sum);
    }

}