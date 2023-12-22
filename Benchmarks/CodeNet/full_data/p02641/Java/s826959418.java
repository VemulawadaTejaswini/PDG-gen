import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int l = -1;
        int r = 1;

        
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            array.add(i+1);
        }
        for(int i = 0; i < n; i++){
            array.set( array.indexOf(sc.nextInt()), 0);
        }
        if(array.get(x-1) == 0){
            while(true){
                if(array.get(x-1 + l) != 0 && array.get(x-1 + r) != 0){
                    System.out.println(array.get(x-1 + l));
                    break;
                }else if(array.get(x-1 + l) != 0 || array.get(x-1 + r) != 0){
                    System.out.println(array.get(x-1 + l) != 0 ? array.get(x-1 + l) : array.get(x-1 + r) != 0 ? array.get(x-1 + r) : "a");
                    break;
                }else {
                    l--;
                    r++;
                }
                
            }
        }else{
            System.out.println(x);
        }
        
    }
}
