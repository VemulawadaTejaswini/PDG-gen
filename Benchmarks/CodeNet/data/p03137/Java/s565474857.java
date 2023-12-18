import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> List= new ArrayList<>();
        for(int a=0;a<M;a++)List.add(sc.nextInt());
        Collections.sort(List,Comparator.reverseOrder());
        ArrayList<Integer> dis_List = new ArrayList<>();
        for(int a=0;a<List.size()-1;a++){
            int dis = List.get(a)-List.get(a+1);
            dis_List.add(dis);
        }
        Collections.sort(dis_List,Comparator.reverseOrder());
        for(int a=0;a<N-1;a++)
        {
            if(dis_List.size()==0)break;
            dis_List.remove(0);
        }

        int sum=0;
        for(int a=0;a<dis_List.size();a++) sum+=dis_List.get(a);
        System.out.println(sum);
    }
}
