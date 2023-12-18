import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> s = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        for(int i=0; i<M; i++){
            s.add(scanner.nextInt());
            c.add(scanner.nextInt());
        }
        int min = pow(10,N-1);
        int max = pow(10,N) - 1;
        if(N==1){
            min = 0;
            max = 9;
        }

        boolean noanswer = true;
        for(int i=min; i<=max; i++){
            boolean found = true;
            for(int j=0; j<M; j++){
                if(bketa(i,N-s.get(j)) != c.get(j)){
                    found = false;
                }
            }
            if(found){
                noanswer=false;
                System.out.println(i);
                break;
            }
        }
        if(noanswer){
            System.out.println(-1);
        }
    }
    public static int bketa(int a, int b){
        int red = a / pow(10,b);
        return red % 10;
    }
    public static int pow(int a, int b){
        int res = 1;
        for(int i=0; i<b; i++){
            res = res * a;
        }
        return res;
    }
}