import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<m;i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
            if(map.containsKey(s)){
                if(map.get(s)!=c){
                    System.out.println(-1);
                    return;
                }
            }else {
                map.put(s, c);
            }
        }
        
        if(n==1&&!map.containsKey(1)){
            System.out.println(0);
            return;
        }
        if(n==1&&map.get(1)==0){
            System.out.println(0);
            return;
        }

        if(map.containsKey(1)&&map.get(1)==0){
            System.out.println(-1);
            return;
        }

        boolean flag=false;



        for(int i=1;i<n+1;i++){
            if(map.containsKey(i)) {
                System.out.print(map.get(i));
                flag=true;
            }
            else if(flag)System.out.print(0);
            else {
                System.out.print(1);
                flag=true;
            }
        }
        System.out.println();




    }
}


