import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Set<Long> tmp = new HashSet<>();
        Integer n = sc.nextInt();
        for(int i=0;i<n;i++){
            tmp.add(sc.nextLong());
        }
        if(tmp.size()<n){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
