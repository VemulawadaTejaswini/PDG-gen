import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrayList1 = new ArrayList<Integer>();
        List<Integerr> arrayList2 = new ArrayList<Integer>();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        for(int i = 1; i <= K; i++){
            int d = scanner.nextInt();
            for(int s = 0; s <= d; s++){
                int A = scanner.nextInt();
                arrayList2.add(A-1);
            }
            arrayList1.add(arrayList2);
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