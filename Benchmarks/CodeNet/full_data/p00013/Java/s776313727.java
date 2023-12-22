import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> Train = new ArrayList<>();
        
        while(sc.hasNext()){
            int N = sc.nextInt();
            if(N == 0){
                System.out.println(Train.get(Train.size()-1));
                Train.remove(Train.size()-1);
            }else{
                Train.add(N);
            }
        }
    }
}
