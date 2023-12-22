import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();;
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int notcon = 101;
        int notcon2 = 101;
        for(int i = 0;i < N;i++){
            list.add(sc.nextInt());
        }
        int Forbidden = X + 1;
        for(int i = 0;i < 100;i++){
            if(!list.contains(Forbidden)){
                //int notcon = X;
                notcon = Forbidden;
                //System.out.println(notcon);
                break;
            }
            Forbidden++;
        }
        int Forbidden2 = X - 1;
        for(int i = 0;i < 100;i++){
            if(!list.contains(Forbidden2)){
                //int notcon2 = X;
                notcon2 = Forbidden2;
                //System.out.println(notcon2 + 'a');
                break;
            }
            Forbidden--;
        }
        if(list == null || list.size() == 0){
            System.out.println(X);
        }else if(notcon - X < notcon2 - X){
            System.out.println(notcon);
        }else if(notcon - X > notcon2 - X){
            System.out.println(notcon2);
        }else if(notcon < notcon2){
            System.out.println(notcon);
        }else if(notcon2 < notcon){
            System.out.println(notcon2);
        }
    }
}
