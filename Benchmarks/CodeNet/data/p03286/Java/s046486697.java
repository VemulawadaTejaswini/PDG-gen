import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0) {
            int digit = n%(-2);
            if(n<0 && digit !=0) {
                n += -2;
                digit = 1;
            }
            list.add(digit);
            n/=-2;
        }
        if(list.size()==0) {
            System.out.println(0);
            return;
        }
        Collections.reverse(list);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next());
        }
        System.out.println();

    }
}