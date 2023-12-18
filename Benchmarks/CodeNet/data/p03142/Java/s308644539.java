
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        int root;
        for(int a=0;a<N;a++){
            ArrayList<Integer> each_node = new ArrayList<>();
            List.add(each_node);
        }
        for(int a=0;a<N-1+M;a++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            ArrayList<Integer> en = List.get(t-1);
            en.add(s);
            List.set(t-1,en);
        }
        for(int a=0;a<M;a++){
            for(int b=0;b<N;b++){
                if(List.get(b).size()>=2){
                    List.get(b).remove(0);
                    break;
                }
                else if(List.get(b).size()==0) List.get(b).add(0);
            }
        }
        for(int a=0;a<N;a++){
            System.out.println(List.get(a).get(0));
        }

    }
}
