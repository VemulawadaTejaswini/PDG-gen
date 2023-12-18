import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力                                                                                                                    
        int H = sc.nextInt();
        int W = sc.nextInt();
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i=1; i<= H ; i++){
            String a = sc.next();
            for(int j=0; j<W ; j++){
                char b = a.charAt(j);
                if(map.containsKey(b)){
                    map.put(b, map.get(b)+1);
                }else{
                    map.put(b,1);
                }

            }
        }

        int rem0 = 0, rem1=0, rem2=0, rem3=0;

        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue()%4 == 0) rem0++;
            else if(e.getValue()%4 == 1) rem1++;
            else if(e.getValue()%4 == 2) rem2++;
            else rem3++;
        }

        if(W%2 == 0 && H%2 == 0 && rem1 + rem2 + rem3 == 0) System.out.println("yes");
        else if(W%2 == 0 && H%2 == 1 && rem1 + rem3 == 0
                && 2*rem2 <= W && (W - 2*rem2)%4 == 0) System.out.println("yes");
        else if(W%2 == 1 && H%2 == 0 && rem1 + rem3 == 0
                && 2*rem2 <= H && (H - 2*rem2)%4 == 0) System.out.println("yes");
        else if(W%2 == 1 && H%2 == 1 && rem1 + rem3 == 1
                && 2*(rem2 + rem3) <= H+W-2 && (H+W-2 - 2*(rem2 + rem3)) % 4 == 0 ) System.out.println("yes");
        else System.out.println("No");
    }
}


