import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        for(int i = 1;i < 10001;i++){
            if(list.get(i-1) == 0){
                break;   
            }
            System.out.println("Case " + i + ": " + list.get(i-1));
            list.add(sc.nextInt());
        }
    }
}
