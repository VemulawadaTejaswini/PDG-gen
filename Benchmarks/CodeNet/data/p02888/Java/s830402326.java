import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int N = sc.nextInt();
        int num = 0;
        for(int i=0;i<N;i++) List.add(sc.nextInt());
        Collections.sort(List);
        HashMap<Integer,Integer> L = new HashMap<>();
        int [] list = new int[3001];
        for(int i=0;i<N;i++) L.put(List.get(i),i);
        int num2 = L.get(Collections.max(List))+1;
        for(int i=3000;i>=1;i--) {
            if(L.get(i)!=null) {
                list[i]=L.get(i);
                num2 = L.get(i);
            }
            else list[i] = num2;
        }
        for(int i=0;i<List.size()-2;i++){
            for(int j=i+1;j<List.size()-1;j++){
                int sum = List.get(i)+List.get(j);
                num+= list[sum]-j-1;
            }
        }
        System.out.println(num);
    }
}