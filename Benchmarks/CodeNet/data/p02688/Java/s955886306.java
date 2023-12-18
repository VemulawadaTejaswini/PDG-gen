import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arraylist = new ArrayList<ArrayList<Integer>>(N);
        
        for(int i = 0;i < N;i++) {
            arraylist.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < (2*K); i++){
            if(i % 2 == 0){
                int d = scanner.nextInt();
            }else{
                for(int s = 0; s <= d; s++){
                    arraylist.get(scan.nextInt() - 1).add(i);
                }
            }
        }
        
        int count_treat = 0;
        for(int i = 0;i < n;i++) {
            if(b_list.get(i).size() == 0) {
                count_treat += 1;
            }
        }

        System.out.println(count_treat);
    }
}