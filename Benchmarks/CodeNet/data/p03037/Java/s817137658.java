import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Map<Integer, List<Integer>> canPass = new HashMap<>();
        for(int i=0; i<M; i++){
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            for(int j=L; j<=R; j++){
                if(!canPass.keySet().contains(j)){
                    canPass.put(j, new ArrayList<>());
                }
                canPass.get(j).add(i);
            }
        }
        int numMasterKey = 0;
        for(int i=1; i<=N; i++){
            if(canPass.containsKey(i) && canPass.get(i).size() == M){
                numMasterKey++;
            }
        }
        System.out.println(String.valueOf(numMasterKey));
    }
}