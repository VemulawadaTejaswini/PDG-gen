import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer,Integer> s = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int n=sc.nextInt();

            if(!s.containsKey(n)){
                s.put(n,1);
            }else{
                s.put(n,s.get(n)+1);
            }
        }


        if(s.size() > 3){
            System.out.println("No");
            return;
        }

        Set<Integer> ks = s.keySet();
        Object[] arr = ks.toArray();
        if(s.size()==1){
            int v = (Integer)arr[0];
            if( (v ^ v) != v){
                System.out.println("No");
                return;
            }
        }else if(s.size()==2){
            if(N%3 != 0 ){
                System.out.println("No");
                return;
            }

            int v1 = (Integer)arr[0];
            int v2 = (Integer)arr[1];
            int n1 = s.get(v1);
            int n2 = s.get(v2);
            if(n1!=n2*2 && n1*2!=n2){
                System.out.println("No");
                return;
            }
            if(n1==n2*2 && (v1 ^ v1) != v2){
                System.out.println("No");
                return;
            }
            if(n1*2==n2 && (v2 ^ v2) != v1){
                System.out.println("No");
                return;
            }


        }else{//3

            if(N%3 != 0 ){
                System.out.println("No");
                return;
            }

            int v1 = (Integer)arr[0];
            int v2 = (Integer)arr[1];
            int v3 = (Integer)arr[2];
            if( (v1 ^ v2) != v3){
                System.out.println("No");
                return;
            }
            int n1 = s.get(v1);
            int n2 = s.get(v2);
            int n3 = s.get(v3);
            if(n1 != n2 || n2 != n3 || n1 != n3 ){
                System.out.println("No");
                return;
            }
        }




        System.out.println("Yes");

    }
}
