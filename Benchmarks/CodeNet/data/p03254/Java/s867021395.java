import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(); 
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        a.sort(Integer::compareTo);
        boolean flag = false;
        for(int i=0; i<n; i++){
            int ax = a.get(i);
            x = x-ax;
            if(x<0){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(n);
        }
    }
}