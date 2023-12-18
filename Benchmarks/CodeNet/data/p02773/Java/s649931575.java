import java.util.*;

public class Main{

    static int mod = (int) 1e9 + 7;
    static int dx[] = {-1, 0, 1, 0}, dy[] = {0, -1, 0, 1};
    static int INF = Integer.MAX_VALUE/2;

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //Queue<int[]> q = new ArrayDeque<int[]>();
        Integer N = new Integer(scan.nextInt());
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<Integer> ai = new ArrayList<Integer>();

        for(int i=0;i<N;i++){
            String str = scan.next();
            int j;
            if((j=a.indexOf(str))==-1){
                a.add(str);
                ai.add(1);                
            }else{
                ai.set(j,ai.get(j)+1);
            }
        }

        int max = 0;
        for(int i=0;i<ai.size();i++){
            if(ai.get(i) > max) max = ai.get(i);
        }

        ArrayList<String> ast = new ArrayList<String>();
        for(int i=0;i<a.size();i++){
            if(ai.get(i) == max){
                ast.add(a.get(i));
            }
        }

        Collections.sort(ast);

        for(int i=0;i<ast.size();i++){
            System.out.println(ast.get(i));
        }
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}