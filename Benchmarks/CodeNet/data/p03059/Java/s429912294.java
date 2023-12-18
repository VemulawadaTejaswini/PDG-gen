import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//3
        int box = a;
        int b = sc.nextInt();//2
        int t = sc.nextInt();//9
        t += 1;//t=10
        //int count = 0;
        ArrayList<Integer> time = new ArrayList<>();
        while(a < t){//3<9T,6<9T,12<9F
            time.add(a);
            a *= 2;
        }
        System.out.println((time.size()+1) * b);
    }
}