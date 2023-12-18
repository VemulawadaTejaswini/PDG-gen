public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] abc = null;
        int tmp;
        for(int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(sc.next());
        }
        
        tmp = abc[0];
        abc[0] = abc[1];
        abc[1] = tmp;

        tmp = abc[0];
        abc[0] = abc[2];
        abc[2] = tmp;
        
        for(int i : abc) {
            System.out.println(i);
        }
    }
}