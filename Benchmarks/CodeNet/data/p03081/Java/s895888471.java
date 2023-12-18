import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        char[] cells = sc.next().toCharArray();
        int[] golems = new int[N];
        for(int i = 0; i < N; i++){
            golems[i] = 1;
        }
        List<Integer>[] golem_memo = new ArrayList[26];
        char[] alphabetlist = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for(char i : alphabetlist){
            golem_memo[i%26] = new ArrayList<Integer>();
        }
        for(int i = 0; i < N; i++){
            golem_memo[cells[i]%26].add(i);
        }
 
        for(int i = 0; i < Q; i++){
            char letter = sc.next().charAt(0);
            char direction = sc.next().charAt(0);
            if(direction == 'L'){
                for(int point : golem_memo[letter%26]){
                    if(golems[point]>0){
                        if(point != 0){
                            golems[point-1] += golems[point];
                        }
                        golems[point] = 0;
                    }
                }
            } else if(direction == 'R'){
                for(int point : golem_memo[letter%26]){
                    if(golems[point]>0){
                        if(point != N-1){
                            golems[point+1] += golems[point];
                        }
                        golems[point] = 0;
                    }
                }
            }
        }
 
        int sum = 0;
        for(int i=0; i<golems.length; i++){
            sum += golems[i];
        }
        System.out.println(sum);
    }
}