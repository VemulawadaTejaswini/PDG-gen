import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int num=0;
        ArrayList<Integer> A_List = DIV(A);
        ArrayList<Integer> B_List = DIV(B);
        for(int i=0;i<A_List.size();i++) if(B_List.contains(A_List.get(i))) num++;
        System.out.println(num+1);
    }
    public static ArrayList<Integer> DIV(long A){
        ArrayList<Integer> List = new ArrayList<>();
        if(A%2==0){
            List.add(2);
            A/=2;
        }
        for(int i=3;i<=A;i+=2){
            if(A==1)break;
            if(A%i==0){
                List.add(i);
                A/=i;
            }
        }
        return List;
    }
}