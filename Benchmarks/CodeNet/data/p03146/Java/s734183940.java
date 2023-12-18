import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        boolean jdg = false;
        List<Integer> a = new ArrayList<>();
        for(int i = 0;jdg == true;i++){
            if(a.contains(s))
            break;
            a.add(s);
            s = s%2 == 0 ? s/2 : s*3+1;
        }
        System.out.println(a.size()+1);
    }
}