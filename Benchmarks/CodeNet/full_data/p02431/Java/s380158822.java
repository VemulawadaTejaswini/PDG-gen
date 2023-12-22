import java.util.*;

public class Main{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> sales = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            
            switch(a){
                case 0:
                    sales.add(sc.nextInt());
                    break;
                case 1:
                    System.out.println(sales.get(sc.nextInt()));
                    break;
                case 2:
                    sales.remove(i-1);
                    break;                        
            }
        }
    }
}
