import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        LinkedList<Integer> res = new LinkedList<>();
        boolean atEnd = true;
        for(int i=0;i<n;i++){
            if(atEnd) res.addLast(a[i]);
            else res.addFirst(a[i]);
            atEnd = !atEnd;
        }
        if(n%2==1){
            while(res.size()>0){
                System.out.print(res.removeLast());
                System.out.print(" ");
            }
        }
        else{
            while(res.size()>0){
                System.out.print(res.poll());
                System.out.print(" ");
            }
        }
    }
}
 