import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Character> list = new ArrayList<>();
        char c = scanner.next().charAt(0);
        list.add(c);
        int q = scanner.nextInt();
        boolean reverse = false;
        for(int i = 0; i < q; i++){
            int t = scanner.nextInt();
            if(t == 1){
                reverse = !reverse;
            }else{
                int t1 = scanner.nextInt();
                char t2 = scanner.next().charAt(0); 
                if(t1 == 1 && !reverse || t1 == 2 && reverse){list.add(t2);}
                else{list.add(0,t2);}
            }
        }
        if(reverse){
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i));
            }
        }else{
            for(int i = list.size()-1; i >= 0; i--){
                System.out.print(list.get(i));
            }
        }
    }
}

