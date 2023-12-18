import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int An = Integer.parseInt(sc.next());
        int Bn = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int[] ACandidate = new int[An];
        int[] BCandidate = new int[Bn];
        for (int i = 0; i < An; i++) {
            ACandidate[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < Bn; i++) {
            BCandidate[i] = Integer.parseInt(sc.next());
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = A + 1; i <= B; i++) {
            list.add(i);
        }
        Arrays.sort(ACandidate);
        Arrays.sort(BCandidate);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (ACandidate[0] < list.get(i) && BCandidate[BCandidate.length -1] >= list.get(i)) {
                System.out.println("No War");
                return;
            }
        }
        System.out.println("War");
    }
}
