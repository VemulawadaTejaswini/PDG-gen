import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] string = new String[n];

        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(scan.next());
        }

        Collections.reverse(a);
        for(int i = 0; i < a.size(); i++){
            if(i < a.size()-1){
                System.out.print(a.get(i) + " ");
            }else{
                System.out.print(a.get(i));
            }
        }
        System.out.println();
    }
}