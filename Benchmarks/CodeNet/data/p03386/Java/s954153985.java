import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int A,B,K;
        A=sc.nextInt();
        B=sc.nextInt();
        K=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int a=A;a<A+K;a++){
            list.add(a);
        }
        for(int a=B-K+1;a<=B;a++){
            if(list.contains(a)!=true) list.add(a);
        }
        for (int a=0;a<list.size();a++){
            System.out.println(list.get(a));
        }
    }
}