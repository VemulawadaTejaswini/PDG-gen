import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int d = sc.nextInt();
            map.put(d, i);
        }
        System.out.println(map.size());
    }
}